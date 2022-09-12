package defpackage;
/* compiled from: PG */
/* renamed from: jjn  reason: default package */
/* loaded from: classes.dex */
public enum jjn {
    HIDDEN(0.0f),
    COLLAPSED(25.0f),
    EXPANDED(75.0f),
    FULLY_EXPANDED(100.0f);
    
    jjn e;
    jjn f;
    public final float g;

    static {
        jjn jjnVar = HIDDEN;
        jjn jjnVar2 = COLLAPSED;
        jjn jjnVar3 = EXPANDED;
        jjn jjnVar4 = FULLY_EXPANDED;
        jjnVar.e = jjnVar;
        jjnVar.f = jjnVar;
        jjnVar2.e = jjnVar2;
        jjnVar2.f = jjnVar3;
        jjnVar3.e = jjnVar2;
        jjnVar3.f = jjnVar4;
        jjnVar4.e = jjnVar3;
        jjnVar4.f = jjnVar4;
    }

    jjn(float f) {
        this.g = f;
    }

    public final boolean b() {
        return (this == HIDDEN || this == COLLAPSED) ? false : true;
    }

    public final boolean c(jjn jjnVar) {
        return this.g > jjnVar.g;
    }
}
