package com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service;

import com.google.android.apps.youtube.embeddedplayer.service.model.AdEventData;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements ynl {
    public final aadd a;
    int b = 2;
    public boolean c;
    private final acrr d;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a e;
    private final String f;
    private String g;

    public b(com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar, acrr acrrVar, String str, aadd aaddVar) {
        this.e = aVar;
        this.d = acrrVar;
        this.f = str;
        this.a = aaddVar;
    }

    private final void a(int i, int i2) {
        aqtx aqtxVar;
        aqtw aqtwVar;
        if (i == 0) {
            aqtxVar = aqtx.EMBEDS_AD_EVENT_TYPE_AD_STARTED;
        } else if (i == 1) {
            aqtxVar = aqtx.EMBEDS_AD_EVENT_TYPE_AD_COMPLETED;
        } else if (i == 2) {
            aqtxVar = aqtx.EMBEDS_AD_EVENT_TYPE_AD_SKIPPED;
        } else if (i == 3) {
            aqtxVar = aqtx.EMBEDS_AD_EVENT_TYPE_AD_CLICKED;
        } else if (i == 4) {
            aqtxVar = aqtx.EMBEDS_AD_EVENT_TYPE_AD_PAUSED;
        } else if (i != 5) {
            aqtxVar = aqtx.EMBEDS_AD_EVENT_TYPE_AD_SUSPENDED;
        } else {
            aqtxVar = aqtx.EMBEDS_AD_EVENT_TYPE_AD_RESUMED;
        }
        if (i2 == 1) {
            aqtwVar = aqtw.EMBEDS_AD_BREAK_TYPE_PRE_ROLL;
        } else if (i2 == 2) {
            aqtwVar = aqtw.EMBEDS_AD_BREAK_TYPE_MID_ROLL;
        } else if (i2 == 3) {
            aqtwVar = aqtw.EMBEDS_AD_BREAK_TYPE_POST_ROLL;
        } else {
            aqtwVar = aqtw.EMBEDS_AD_BREAK_TYPE_UNKNOWN;
        }
        aqty a = aqtz.a();
        a.copyOnWrite();
        aqtz.c((aqtz) a.instance, aqtxVar);
        a.copyOnWrite();
        aqtz.d((aqtz) a.instance, aqtwVar);
        String str = this.f;
        a.copyOnWrite();
        aqtz.e((aqtz) a.instance, str);
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).cr((aqtz) a.mo39build());
        arrh arrhVar = (arrh) a2.mo39build();
        if (this.c) {
            this.d.c(arrhVar);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        int i2 = 4;
        int i3 = 3;
        int i4 = 1;
        if (i != -1) {
            if (i == 0) {
                wxn wxnVar = (wxn) obj;
                com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar = this.e;
                com.google.android.apps.youtube.embeddedplayer.service.model.a c = AdEventData.c();
                c.c(3);
                c.b(0);
                c.a = this.g;
                aVar.a(c.a());
                a(3, 0);
                return null;
            } else if (i == 1) {
                wxo wxoVar = (wxo) obj;
                if (wxoVar.a() != wzq.USER_SKIPPED && wxoVar.a() != wzq.VIDEO_ENDED) {
                    return null;
                }
                this.b = 2;
                xdb xdbVar = xdb.PRE_ROLL;
                int ordinal = wxoVar.a().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        String valueOf = String.valueOf(wxoVar.a());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                        sb.append("Unexpected AdCompleteEvent reason value: ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                    i4 = 2;
                }
                PlayerAd b = wxoVar.b();
                String str = b != null ? b.f : "";
                com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar2 = this.e;
                com.google.android.apps.youtube.embeddedplayer.service.model.a c2 = AdEventData.c();
                c2.c(i4);
                c2.b(0);
                c2.a = str;
                aVar2.a(c2.a());
                a(i4, 0);
                return null;
            } else if (i == 2) {
                wxr wxrVar = (wxr) obj;
                if (wxrVar.a() != wxq.AD_VIDEO_PLAY_REQUESTED) {
                    return null;
                }
                PlayerAd c3 = wxrVar.c();
                if (c3 != null) {
                    this.g = c3.f;
                }
                this.b = 0;
                wzq wzqVar = wzq.VIDEO_ENDED;
                xdb xdbVar2 = xdb.PRE_ROLL;
                int ordinal2 = wxrVar.b().ordinal();
                if (ordinal2 == 0) {
                    i3 = 1;
                } else if (ordinal2 == 1) {
                    i3 = 2;
                } else if (ordinal2 != 2) {
                    String valueOf2 = String.valueOf(wxrVar.b());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 52);
                    sb2.append("AdVideoStageEvent contains an unexpected BreakType: ");
                    sb2.append(valueOf2);
                    afus.b(1, 4, sb2.toString());
                    i3 = 0;
                }
                com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar3 = this.e;
                com.google.android.apps.youtube.embeddedplayer.service.model.a c4 = AdEventData.c();
                c4.c(0);
                c4.b(i3);
                c4.a = this.g;
                aVar3.a(c4.a());
                a(0, i3);
                return null;
            } else if (i == 3) {
                ahia ahiaVar = (ahia) obj;
                if (this.b == 2) {
                    return null;
                }
                int a = ahiaVar.a();
                if (a != 2) {
                    if (a == 3) {
                        this.b = 1;
                    } else if (a != 4 && a != 7 && a != 8) {
                        return null;
                    } else {
                        this.b = 2;
                        i2 = 6;
                    }
                } else if (this.b != 1) {
                    return null;
                } else {
                    this.b = 0;
                    i2 = 5;
                }
                com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar4 = this.e;
                com.google.android.apps.youtube.embeddedplayer.service.model.a c5 = AdEventData.c();
                c5.c(i2);
                c5.b(0);
                c5.a = this.g;
                aVar4.a(c5.a());
                a(i2, 0);
                return null;
            } else {
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append("unsupported op code: ");
                sb3.append(i);
                throw new IllegalStateException(sb3.toString());
            }
        }
        return new Class[]{wxn.class, wxo.class, wxr.class, ahia.class};
    }
}
