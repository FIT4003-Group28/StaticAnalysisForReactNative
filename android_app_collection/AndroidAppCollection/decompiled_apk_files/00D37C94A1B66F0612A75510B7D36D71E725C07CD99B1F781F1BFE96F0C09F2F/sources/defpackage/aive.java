package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aive  reason: default package */
/* loaded from: classes.dex */
public final class aive {
    public final aivb a;
    public aiva b;
    public String c;
    private final aisp d;

    public aive(aivb aivbVar, aisp aispVar) {
        this.a = aivbVar;
        this.d = aispVar;
    }

    public final void a() {
        this.d.a.Z(new ayqb() { // from class: aivd
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aive aiveVar = aive.this;
                ahhw ahhwVar = (ahhw) obj;
                aika c = ahhwVar.c();
                aika aikaVar = aika.NEW;
                int ordinal = c.ordinal();
                String str = null;
                if (ordinal == 0) {
                    aiveVar.c = null;
                    aiva aivaVar = aiveVar.b;
                    if (aivaVar == null) {
                        return;
                    }
                    aivaVar.f = true;
                    Thread thread = aivaVar.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                    aiveVar.b = null;
                } else if (ordinal != 5 && ordinal != 8) {
                } else {
                    PlayerResponseModel a = ahhwVar.c().h() ? ahhwVar.a() : ahhwVar.b();
                    if (a == null) {
                        return;
                    }
                    VideoStreamingData videoStreamingData = a.c;
                    Uri parse = (videoStreamingData == null || videoStreamingData.b.i.isEmpty()) ? null : Uri.parse(videoStreamingData.b.i);
                    apyx apyxVar = a.c().c.H;
                    if (apyxVar == null) {
                        apyxVar = apyx.a;
                    }
                    int i = apyxVar.b;
                    if (ahhwVar.a() != null) {
                        str = ahhwVar.k();
                    } else if (ahhwVar.b() != null) {
                        str = ahhwVar.e();
                    }
                    String str2 = str;
                    String B = a.B();
                    if (B.equals(aiveVar.c)) {
                        return;
                    }
                    aiveVar.c = B;
                    aivb aivbVar = aiveVar.a;
                    Executor executor = (Executor) aivbVar.a.get();
                    executor.getClass();
                    afjm afjmVar = (afjm) aivbVar.b.get();
                    afjmVar.getClass();
                    pwx pwxVar = (pwx) aivbVar.c.get();
                    pwxVar.getClass();
                    final aiva aivaVar2 = new aiva(executor, afjmVar, pwxVar, parse, i, str2);
                    aiveVar.b = aivaVar2;
                    if (aivaVar2.d == null) {
                        return;
                    }
                    aivaVar2.a.execute(new Runnable() { // from class: aiuz
                        @Override // java.lang.Runnable
                        public final void run() {
                            asv asvVar;
                            int g;
                            aiva aivaVar3 = aiva.this;
                            ylr.b();
                            aivaVar3.g = Thread.currentThread();
                            int i2 = 4096;
                            byte[] bArr = new byte[4096];
                            aivaVar3.c.a(-10);
                            long j = -1;
                            boolean z = false;
                            while (!aivaVar3.f && !z) {
                                try {
                                    int i3 = aivaVar3.e;
                                    if (i3 > 0) {
                                        Thread.sleep(i3);
                                    }
                                    aivaVar3.c.d();
                                    asy asyVar = aivaVar3.d;
                                    long j2 = asyVar.g;
                                    try {
                                        j = aivaVar3.b.h(asyVar);
                                        while (!aivaVar3.f && (g = aivaVar3.b.g(bArr, 0, i2)) >= 0) {
                                            j2 += g;
                                        }
                                        long j3 = aivaVar3.d.g;
                                    } catch (pww unused) {
                                        long j4 = j2;
                                        asy asyVar2 = aivaVar3.d;
                                        if (j4 > asyVar2.g) {
                                            aivaVar3.d = new asy(asyVar2.a, j4, j, asyVar2.i);
                                        }
                                        asvVar = aivaVar3.b;
                                        asvVar.j();
                                        z = false;
                                        i2 = 4096;
                                    } catch (IOException unused2) {
                                        aivaVar3.f = true;
                                        try {
                                            asvVar = aivaVar3.b;
                                            asvVar.j();
                                        } catch (IOException unused3) {
                                            z = false;
                                            i2 = 4096;
                                        }
                                        z = false;
                                        i2 = 4096;
                                    }
                                    try {
                                        aivaVar3.b.j();
                                    } catch (IOException unused4) {
                                    } catch (InterruptedException unused5) {
                                        z = true;
                                        aivaVar3.f = true;
                                        i2 = 4096;
                                    }
                                    z = true;
                                } catch (InterruptedException unused6) {
                                    z = false;
                                }
                                i2 = 4096;
                            }
                            aivaVar3.c.c(-10);
                        }
                    });
                }
            }
        });
    }
}
