package defpackage;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afaw  reason: default package */
/* loaded from: classes.dex */
public final class afaw implements afho {
    final /* synthetic */ afhu a;
    final /* synthetic */ afao b;
    final /* synthetic */ afap c;

    public afaw(afhu afhuVar, afao afaoVar, afap afapVar) {
        this.a = afhuVar;
        this.b = afaoVar;
        this.c = afapVar;
    }

    @Override // defpackage.afho
    public final aehd a(aehc aehcVar) {
        afhu afhuVar = this.a;
        String str = aehcVar.b;
        afao afaoVar = this.b;
        afap afapVar = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
        sb.append("new MediaParsersListenerNativeHandler(");
        sb.append(str);
        sb.append(")");
        afhv a = afhuVar.a(sb.toString().getBytes());
        if (a == null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25);
            sb2.append("Instance \"");
            sb2.append(str);
            sb2.append("\" is not valid.");
            throw new IllegalArgumentException(sb2.toString());
        }
        afav afavVar = new afav(new afhp(a), afapVar, afaoVar);
        afai afaiVar = this.b.b;
        afav afavVar2 = afaiVar.c;
        if (afavVar2 != null) {
            afgx afgxVar = new afgx(4);
            afgxVar.b = "MediaParsers Initialize Already Called.";
            afgxVar.b("c", "initalreadycalled");
            afavVar2.a(afgxVar.a());
        } else {
            afaiVar.c = afavVar;
        }
        return aehd.a;
    }

    @Override // defpackage.afho
    public final aehj b(aehi aehiVar) {
        afgy a;
        int position;
        afai afaiVar = this.b.b;
        ajfw ajfwVar = aehiVar.b;
        if (ajfwVar == null) {
            ajfwVar = ajfw.a;
        }
        String str = aehiVar.c;
        ByteBuffer wrap = ByteBuffer.wrap(aehiVar.d.I());
        long j = aehiVar.e;
        int i = aehiVar.f;
        afms.a(afaiVar.c);
        try {
            afah afahVar = (afah) afaiVar.b.get(ajfwVar);
            if (afahVar == null) {
                afahVar = new afah(afaiVar, ajfwVar, str);
                afaiVar.b.put(ajfwVar, afahVar);
            }
            afahVar.f = -9223372036854775807L;
            afahVar.g = -9223372036854775807L;
            afahVar.h = 0L;
            afahVar.e = i;
            long j2 = afahVar.d;
            if (j2 == -1 || j != j2 + 1) {
                afahVar.c.g(0L, 0L);
            }
            int position2 = wrap.position();
            try {
                afahVar.c.a(wrap, j);
                if (wrap.position() - position2 > 0) {
                    afahVar.d = (j + position) - 1;
                }
                afms.d(!wrap.hasRemaining());
                afav afavVar = afaiVar.c;
                long j3 = afahVar.f;
                long j4 = afahVar.g;
                long j5 = afahVar.h;
                afhp afhpVar = afavVar.a;
                aopa createBuilder = aehe.a.createBuilder();
                createBuilder.copyOnWrite();
                aehe aeheVar = (aehe) createBuilder.instance;
                ajfwVar.getClass();
                aeheVar.c = ajfwVar;
                aeheVar.b |= 1;
                double b = afag.b(j3);
                createBuilder.copyOnWrite();
                aehe aeheVar2 = (aehe) createBuilder.instance;
                aeheVar2.b |= 2;
                aeheVar2.d = b;
                double b2 = afag.b(j4);
                createBuilder.copyOnWrite();
                aehe aeheVar3 = (aehe) createBuilder.instance;
                aeheVar3.b |= 4;
                aeheVar3.e = b2;
                double b3 = afag.b(j5);
                createBuilder.copyOnWrite();
                aehe aeheVar4 = (aehe) createBuilder.instance;
                aeheVar4.b |= 8;
                aeheVar4.f = b3;
                try {
                    aehf aehfVar = (aehf) aopi.parseFrom(aehf.a, afhpVar.a.a("onParse", ((aehe) createBuilder.mo39build()).toByteArray()), aoos.b());
                } catch (aopx e) {
                    throw new RuntimeException("Unexpected protobuf error", e);
                }
            } catch (pjq e2) {
                afgx afgxVar = new afgx(3);
                int i2 = afahVar.b.c;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Parser error for itag ");
                sb.append(i2);
                afgxVar.b = sb.toString();
                afgxVar.a = e2;
                afgxVar.c(afahVar.b.c);
                throw afgxVar.a();
            }
        } catch (Exception e3) {
            afaiVar.b.remove(ajfwVar);
            if (e3 instanceof afgy) {
                a = (afgy) e3;
            } else {
                afgx afgxVar2 = new afgx(4);
                int i3 = ajfwVar.c;
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("Unexpected error while parsing itag ");
                sb2.append(i3);
                afgxVar2.b = sb2.toString();
                afgxVar2.a = e3;
                afgxVar2.b("c", "pushmedia");
                afgxVar2.c(ajfwVar.c);
                a = afgxVar2.a();
            }
            afaiVar.c.a(a);
        }
        return aehj.a;
    }

    @Override // defpackage.afho
    public final aehh c() {
        return aehh.a;
    }
}
