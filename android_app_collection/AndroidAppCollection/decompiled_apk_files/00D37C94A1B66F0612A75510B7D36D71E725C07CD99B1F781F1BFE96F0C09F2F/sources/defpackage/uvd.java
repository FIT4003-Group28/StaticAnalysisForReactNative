package defpackage;

import android.os.health.TimerStat;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uvd  reason: default package */
/* loaded from: classes4.dex */
public final class uvd extends uvb {
    public static final uvd a = new uvd();

    private uvd() {
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ aoqu a(String str, Object obj) {
        return uut.k(str, (TimerStat) obj);
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ aoqu b(aoqu aoquVar, aoqu aoquVar2) {
        return uut.j((azzi) aoquVar, (azzi) aoquVar2);
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ String c(aoqu aoquVar) {
        azzi azziVar = (azzi) aoquVar;
        azzd azzdVar = azziVar.e;
        if (azzdVar == null) {
            azzdVar = azzd.a;
        }
        int i = azzdVar.b & 2;
        azzd azzdVar2 = azziVar.e;
        if (i != 0) {
            if (azzdVar2 == null) {
                azzdVar2 = azzd.a;
            }
            return azzdVar2.d;
        }
        if (azzdVar2 == null) {
            azzdVar2 = azzd.a;
        }
        return Long.toHexString(azzdVar2.c);
    }
}
