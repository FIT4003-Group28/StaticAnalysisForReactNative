package defpackage;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Random;
/* compiled from: PG */
/* renamed from: qar  reason: default package */
/* loaded from: classes4.dex */
public final class qar {
    public static final qar a = new qar();
    public final Random b;
    private final qga c;
    private final qap d;
    private final VersionInfoParcel e;

    protected qar() {
        qga qgaVar = new qga();
        qag qagVar = new qag();
        qaf qafVar = new qaf();
        new qcn();
        new qeh();
        new qfo();
        new qei();
        qap qapVar = new qap(qagVar, qafVar);
        qga.d();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0);
        Random random = new Random();
        this.c = qgaVar;
        this.d = qapVar;
        this.e = versionInfoParcel;
        this.b = random;
    }

    public static qap a() {
        return a.d;
    }

    public static VersionInfoParcel b() {
        return a.e;
    }

    public static void c() {
        qga qgaVar = a.c;
    }
}
