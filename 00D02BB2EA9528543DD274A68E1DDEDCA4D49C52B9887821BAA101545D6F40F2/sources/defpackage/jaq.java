package defpackage;
/* compiled from: PG */
/* renamed from: jaq  reason: default package */
/* loaded from: classes.dex */
public enum jaq {
    NO_TINT_ON_WHITE(irm.w),
    NO_TINT_ON_WHITE_WITH_GREY_SHADOW(irm.z),
    NO_TINT_ON_BLACK_WITH_WHITE_SHADOW(irm.D),
    MOD_GREY_ON_NIGHTBLACK_WITH_WHITE_SHADOW(irm.D, ibl.i()),
    MOD_GREY_ON_DARK_GREY_WITH_WHITE_SHADOW(irm.E, ire.e()),
    NO_TINT_ON_DARK_GREY_WITH_WHITE_SHADOW(irm.E),
    NO_TINT_ON_TRANSPARENT(cqtt.c()),
    NO_TINT_MOD_DAY_NIGHT_WHITE(ibo.f()),
    NO_TINT_DAY_NIGHT_ON_WHITE(irm.w),
    NO_TINT_DAY_NIGHT_ON_WHITE_WITH_GREY_SHADOW(irm.z),
    DAY_NIGHT_WHITE_ON_BLUE(irm.B, ibm.b()),
    MOD_DAY_NIGHT_WHITE_ON_BLUE(irm.C, ibm.b()),
    DAY_NIGHT_GREY_ON_LIGHT_BLUE_GREY(irm.F, irg.i()),
    DAY_NIGHT_BLUE_ON_WHITE(irm.w, irg.s()),
    DAY_NIGHT_RED_ON_WHITE(irm.w, ibm.C());
    
    public final cqtd p;
    @dzsi
    public final cqss q;

    jaq(cqtd cqtdVar) {
        this(cqtdVar, null);
    }

    jaq(cqtd cqtdVar, @dzsi cqss cqssVar) {
        this.p = cqtdVar;
        this.q = cqssVar;
    }
}
