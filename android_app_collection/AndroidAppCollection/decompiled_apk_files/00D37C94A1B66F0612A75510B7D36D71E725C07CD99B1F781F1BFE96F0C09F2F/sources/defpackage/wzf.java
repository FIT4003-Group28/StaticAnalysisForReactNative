package defpackage;

import android.media.AudioManager;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: wzf  reason: default package */
/* loaded from: classes4.dex */
public final class wzf implements afzn {
    private final snc a;
    private final zah b;
    private final yrj c;
    private final String d;
    private final zdw e;

    public wzf(wkn wknVar, snc sncVar, zah zahVar, yrj yrjVar, zdw zdwVar) {
        String valueOf = String.valueOf(wknVar.e);
        this.d = valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        this.a = sncVar;
        this.b = true != wknVar.h ? null : zahVar;
        this.c = yrjVar;
        this.e = zdwVar;
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        Integer num = (Integer) wzc.a.get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 12) {
            yrj yrjVar = this.c;
            return yrjVar != null ? String.valueOf(yrjVar.a()) : "0";
        } else if (intValue == 25) {
            zah zahVar = this.b;
            if (zahVar == null) {
                zep.l("userPresenceTracker is not supported and should not expect receiving LACT macro");
                return "-1";
            }
            return String.valueOf(zahVar.a());
        } else if (intValue == 31) {
            return this.d;
        } else {
            if (intValue != 33) {
                if (intValue == 34) {
                    return Long.toString(this.a.c());
                }
                return null;
            }
            zdw zdwVar = this.e;
            if (zdwVar == null) {
                return "0";
            }
            AudioManager audioManager = (AudioManager) zdwVar.a.getSystemService("audio");
            return Integer.toString(Math.round((audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) * 100.0f));
        }
    }

    @Override // defpackage.afzn
    public final String b() {
        return "wzf";
    }
}
