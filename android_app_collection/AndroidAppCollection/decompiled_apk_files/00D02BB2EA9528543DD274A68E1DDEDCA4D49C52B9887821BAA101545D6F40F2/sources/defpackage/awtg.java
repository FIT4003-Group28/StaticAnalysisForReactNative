package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: awtg  reason: default package */
/* loaded from: classes3.dex */
public final class awtg {
    private static final dcep<String> f = dcep.D("es-MX", "es-AR", "pt-BR");
    public final dmqc a = dmqc.LEGEND_STYLE_SAVED_PARKING_DETECTED_ICON;
    public final dmqc b = dmqc.LEGEND_STYLE_SAVED_PARKING_ICON;
    public final dmqc c = dmqc.LEGEND_STYLE_SAVED_PARKING_ES_DETECTED_ICON;
    public final dmqc d = dmqc.LEGEND_STYLE_SAVED_PARKING_ES_ICON;
    public final dxio<akvz> e;

    public awtg(dxio<akvz> dxioVar) {
        this.e = dxioVar;
    }

    public static boolean a() {
        return f.contains(bvom.a(Locale.getDefault()));
    }
}
