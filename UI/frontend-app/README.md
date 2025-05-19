# High-Availability Mode Infrastructure

## Overview

This project is a high-availability infrastructure setup comprising a backend (Java Spring Boot), a frontend (Next.js), and infrastructure orchestration (Ansible, Docker, Kubernetes) for provisioning and deployment.

## Backend (backend/facingapi)

- **Technology:** Java Spring Boot (Maven).
- **Main entry:** `FacingapiApplication.java`.
- **Controllers:** (e.g. `HelloController.java`) define API endpoints.
- **Models:** (e.g. `UserData.java`) represent data entities.
- **Repositories:** (e.g. `UserDataRepo.java`) handle data access.
- **Docker:** A Dockerfile is provided for containerization.

## Frontend (UI/frontend-app)

- **Technology:** Next.js.
- **Pages:** (e.g. `index.js`, `_app.js`) serve as entry points and routes.
- **Components:** (e.g. `layout.js`) provide reusable UI elements.
- **Utilities:** (e.g. `lib/data.js`, `lib/posts.js`) contain helper functions.
- **Static Assets:** Located in `public/` (images, favicon).
- **Docker:** A Dockerfile is provided for containerization.

## Infrastructure & DevOps (ansible-control)

- **Ansible Playbooks:** Orchestrate provisioning, configuration, and deployment.
  - EC2 instance setup (e.g. `setup_ec2_both.yaml`, `initialize_ec2_containerd_docker.yaml`, `initialize_ec2_kube.yaml`).
  - ELB (Elastic Load Balancer) configuration (e.g. `setup_elb_for_cp.yaml`).
  - Kubernetes (Kubeadm) configuration (e.g. `kubeadm_config.yaml`, `kubelet_config.yaml`, `aws-k8s-cni.yaml`).
  - User management (e.g. `user_create.yaml`, `user_role.yaml`).
  - Termination (e.g. `terminate_ec2_both.yaml`).
- **Requirements:** (e.g. `requirements.yml`) list Ansible dependencies.

## Database (db)

- **Service Definition:** (e.g. `db_service.yml`, `stack.yml`) define database services.
- **Scripts:** (e.g. `create.js`) for database initialization.
- **Docker:** A Dockerfile is provided for containerization.

## Deployment

- **Docker:** Use the provided Dockerfiles (in backend, frontend, and db) to build and run containers.
- **Ansible:** Use the playbooks in `ansible-control/` to provision and configure your infrastructure (EC2, ELB, Kubernetes, etc.).
- **Kubernetes:** (Optional) Use the provided Kubernetes manifests (e.g. in `ansible-control/aws-k8s-cni.yaml`) for orchestration.

## Getting Started

1. **Backend:**  
   - Navigate to `backend/facingapi` and run (or build via Docker) the Spring Boot application.
2. **Frontend:**  
   - Navigate to `UI/frontend-app`, install dependencies (e.g. `npm install`), and run (or build via Docker) the Next.js app.
3. **Infrastructure:**  
   - Use Ansible (e.g. `ansible-playbook ansible-control/setup_ec2_both.yaml`) to provision and configure your infrastructure.
4. **Database:**  
   - Use the provided Dockerfile and service definitions in `db/` to deploy your database.

## Notes

- Ensure that your environment (AWS, Docker, Ansible, etc.) is properly configured.
- Refer to the individual Dockerfiles and Ansible playbooks for further details.