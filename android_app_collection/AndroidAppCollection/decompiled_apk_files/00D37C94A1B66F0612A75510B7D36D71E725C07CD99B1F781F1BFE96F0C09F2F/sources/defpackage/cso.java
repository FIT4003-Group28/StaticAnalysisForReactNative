package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cso  reason: default package */
/* loaded from: classes3.dex */
public final class cso extends dp {
    public final crp a;
    public final csl b;
    public cgg c;
    private final Set d;
    private cso e;

    public cso() {
        crp crpVar = new crp();
        this.b = new csn(this);
        this.d = new HashSet();
        this.a = crpVar;
    }

    private final void a() {
        cso csoVar = this.e;
        if (csoVar != null) {
            csoVar.d.remove(this);
            this.e = null;
        }
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.a.b();
        a();
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        cso csoVar = this;
        while (true) {
            dp dpVar = csoVar.C;
            if (dpVar == null) {
                break;
            }
            csoVar = dpVar;
        }
        eo eoVar = csoVar.z;
        if (eoVar == null) {
            if (!Log.isLoggable("SupportRMFragment", 5)) {
                return;
            }
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            return;
        }
        try {
            Context rb = rb();
            a();
            cso d = cfk.b(rb).e.d(eoVar);
            this.e = d;
            if (equals(d)) {
                return;
            }
            this.e.d.add(this);
        } catch (IllegalStateException e) {
            if (!Log.isLoggable("SupportRMFragment", 5)) {
                return;
            }
            Log.w("SupportRMFragment", "Unable to register fragment with root", e);
        }
    }

    @Override // defpackage.dp
    public final void lU() {
        super.lU();
        a();
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        this.a.c();
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.a.d();
    }

    @Override // defpackage.dp
    public final String toString() {
        String dpVar = super.toString();
        dp dpVar2 = this.C;
        if (dpVar2 == null) {
            dpVar2 = null;
        }
        String valueOf = String.valueOf(dpVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(dpVar).length() + 9 + String.valueOf(valueOf).length());
        sb.append(dpVar);
        sb.append("{parent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
