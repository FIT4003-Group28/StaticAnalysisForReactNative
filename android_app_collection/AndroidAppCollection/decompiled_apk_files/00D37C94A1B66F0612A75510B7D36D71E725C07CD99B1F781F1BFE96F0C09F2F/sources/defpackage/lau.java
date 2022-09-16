package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: lau  reason: default package */
/* loaded from: classes3.dex */
public final class lau {
    final lat b;
    protected final ajwb c;
    public WeakReference d;
    public final las a = new las();
    private final ajsm e = new ajsm();

    public lau(ajwb ajwbVar) {
        this.c = ajwbVar;
        lat latVar = new lat(this);
        this.b = latVar;
        ((ajsf) ajwbVar.f).rZ(latVar);
    }

    public final void a(argv argvVar) {
        if (argvVar == null) {
            return;
        }
        this.e.clear();
        this.e.add(argvVar);
        this.c.J(this.e);
        int intValue = ((Integer) argvVar.qm(argr.c)).intValue();
        if (intValue == -1 || intValue >= argvVar.d.size()) {
            return;
        }
        las lasVar = this.a;
        lasVar.c = intValue;
        aupl auplVar = ((argx) argvVar.d.get(intValue)).k;
        if (auplVar == null) {
            auplVar = aupl.a;
        }
        lasVar.b = auplVar;
    }
}
