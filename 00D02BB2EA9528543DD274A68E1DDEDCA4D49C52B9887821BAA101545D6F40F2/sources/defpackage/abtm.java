package defpackage;
/* compiled from: PG */
/* renamed from: abtm  reason: default package */
/* loaded from: classes2.dex */
public class abtm implements absr {
    private final abss a;
    private final String b;
    private Boolean c = true;

    public abtm(abss abssVar, String str) {
        this.a = abssVar;
        this.b = str;
    }

    @Override // defpackage.absr
    public String a() {
        return this.b;
    }

    @Override // defpackage.absr
    public abiu b() {
        return this.a;
    }

    @Override // defpackage.absr
    public Boolean c() {
        return this.c;
    }

    public boolean d(boolean z) {
        Boolean bool = false;
        this.c = bool;
        return bool.booleanValue();
    }
}
