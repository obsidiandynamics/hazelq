package com.obsidiandynamics.meteor;

public final class NotTenantException extends Exception {
  private static final long serialVersionUID = 1L;

  NotTenantException(String m) {
    super(m);
  }
}
