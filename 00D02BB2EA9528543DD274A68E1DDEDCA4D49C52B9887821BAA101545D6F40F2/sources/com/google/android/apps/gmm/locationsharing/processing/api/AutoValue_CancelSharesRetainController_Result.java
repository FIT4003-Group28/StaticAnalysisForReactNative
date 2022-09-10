package com.google.android.apps.gmm.locationsharing.processing.api;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_CancelSharesRetainController_Result extends CancelSharesRetainController$Result {
    private final int a;
    private final dqzv b;

    public AutoValue_CancelSharesRetainController_Result(int i, dqzv dqzvVar) {
        this.a = i;
        if (dqzvVar != null) {
            this.b = dqzvVar;
            return;
        }
        throw new NullPointerException("Null shareAcl");
    }

    @Override // com.google.android.apps.gmm.locationsharing.processing.api.CancelSharesRetainController$Result
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.locationsharing.processing.api.CancelSharesRetainController$Result
    public final dqzv b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CancelSharesRetainController$Result) {
            CancelSharesRetainController$Result cancelSharesRetainController$Result = (CancelSharesRetainController$Result) obj;
            if (this.a == cancelSharesRetainController$Result.a() && this.b.equals(cancelSharesRetainController$Result.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        dqzv dqzvVar = this.b;
        int i2 = dqzvVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(dqzvVar).c(dqzvVar);
            dqzvVar.bC = i2;
        }
        return i ^ i2;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Result{status=");
        sb.append(i);
        sb.append(", shareAcl=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
