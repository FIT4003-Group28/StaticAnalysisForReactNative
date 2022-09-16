package defpackage;
/* compiled from: PG */
/* renamed from: crn  reason: default package */
/* loaded from: classes3.dex */
public final class crn {
    public final Class a;
    public final crm b;
    private final Class c;

    public crn(Class cls, Class cls2, crm crmVar) {
        this.c = cls;
        this.a = cls2;
        this.b = crmVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
