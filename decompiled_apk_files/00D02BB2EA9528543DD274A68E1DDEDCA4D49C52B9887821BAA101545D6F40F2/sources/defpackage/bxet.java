package defpackage;
/* compiled from: PG */
/* renamed from: bxet  reason: default package */
/* loaded from: classes4.dex */
public final class bxet {
    public final dcka<String, dpui> a = dcgn.O();
    public boolean b = false;

    public static String a(String str, int i) {
        return str.substring(0, i).replaceAll("\\s+", " ").replaceFirst("\\S+$", "").trim();
    }
}
