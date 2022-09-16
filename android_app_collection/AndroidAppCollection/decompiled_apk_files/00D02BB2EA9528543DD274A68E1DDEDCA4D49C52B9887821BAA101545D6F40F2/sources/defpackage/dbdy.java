package defpackage;
/* compiled from: PG */
/* renamed from: dbdy  reason: default package */
/* loaded from: classes5.dex */
public final class dbdy {
    public static boolean a(float f, float f2) {
        float abs = Math.abs(f - f2);
        return abs <= 1.0E-10f || abs <= Math.max(Math.abs(f), Math.abs(f2)) * 1.1920929E-7f;
    }
}
