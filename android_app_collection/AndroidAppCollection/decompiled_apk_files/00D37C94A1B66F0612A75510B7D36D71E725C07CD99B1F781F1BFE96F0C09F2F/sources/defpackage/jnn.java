package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: jnn  reason: default package */
/* loaded from: classes3.dex */
public final class jnn extends agvl {
    public static final /* synthetic */ int b = 0;
    public final yrj a;
    private final SharedPreferences i;
    private final fcu j;
    private final snc k;
    private final fbv l;

    public jnn(SharedPreferences sharedPreferences, fcu fcuVar, aadd aaddVar, int i, yrj yrjVar, agvn agvnVar, snc sncVar, fbv fbvVar) {
        super(sharedPreferences, aaddVar, i, agvnVar);
        this.i = sharedPreferences;
        this.j = fcuVar;
        this.a = yrjVar;
        this.k = sncVar;
        this.l = fbvVar;
    }

    public final long a() {
        return ((fda) this.j.a.c()).l;
    }

    @Override // defpackage.agvl, defpackage.agvq
    public final ampt b() {
        return jny.b;
    }

    @Override // defpackage.agvl, defpackage.agvq
    public final ampt c() {
        return new ampt() { // from class: jnm
            @Override // defpackage.ampt
            public final boolean a(Object obj) {
                PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor) obj;
                return !jnn.this.a.o() || (playbackStartDescriptor != null && !TextUtils.isEmpty(playbackStartDescriptor.k()));
            }
        };
    }

    @Override // defpackage.agvl, defpackage.agvq
    public final amuk d() {
        ArrayList arrayList = new ArrayList(this.g);
        Collections.sort(arrayList, ahdp.b);
        return amuk.o(arrayList);
    }

    @Override // defpackage.agvl, defpackage.agvq
    public final Comparator e() {
        return ahdp.f;
    }

    @Override // defpackage.agvl, defpackage.agvq
    public final Comparator f() {
        return ahdp.d;
    }

    public final void k(atpy atpyVar) {
        if (atpyVar == null || (atpyVar.b & 1) == 0) {
            return;
        }
        atpx b2 = atpx.b(atpyVar.d);
        if (b2 == null) {
            b2 = atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
        }
        if (b2 == atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_SAVE) {
            attl b3 = attl.b(atpyVar.c);
            if (b3 == null) {
                b3 = attl.UNKNOWN_FORMAT_TYPE;
            }
            super.E(b3);
            ylx.m(this.j.d(true), gpe.r);
        } else if (b2 == atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_DONT_SAVE) {
            ylx.m(this.j.d(false), gpe.s);
        } else if (b2 != atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_EXPIRING_SAVE) {
        } else {
            attl b4 = attl.b(atpyVar.c);
            if (b4 == null) {
                b4 = attl.UNKNOWN_FORMAT_TYPE;
            }
            super.E(b4);
            ylx.m(this.j.a.b(new fcp(this.k.c(), 2)), gpe.u);
            ylx.m(this.j.d(true), gpe.t);
        }
    }

    @Override // defpackage.agvl, defpackage.agvq
    public final boolean l() {
        return this.i.getBoolean(agks.WIFI_POLICY, true);
    }

    @Override // defpackage.agvl, defpackage.agvq
    public final boolean m(attp attpVar, atpy atpyVar) {
        Optional empty;
        if (atpyVar == null) {
            attl v = v(attl.UNKNOWN_FORMAT_TYPE);
            if (v != attl.UNKNOWN_FORMAT_TYPE) {
                for (attk attkVar : attpVar.e) {
                    attl b2 = attl.b(attkVar.e);
                    if (b2 == null) {
                        b2 = attl.UNKNOWN_FORMAT_TYPE;
                        continue;
                    }
                    if (b2 == v) {
                        empty = Optional.of(attkVar);
                        break;
                    }
                }
            }
            empty = Optional.empty();
            if (empty.isPresent()) {
                attk attkVar2 = (attk) empty.get();
                if ((attkVar2.b & 8) != 0) {
                    attj b3 = attj.b(attkVar2.f);
                    if (b3 == null) {
                        b3 = attj.OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN;
                    }
                    if (b3 == attj.OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED) {
                        return true;
                    }
                }
                if ((attkVar2.b & 16) != 0 && attkVar2.g && (a() == 0 || (this.l.a() > 0 && Instant.ofEpochMilli(this.k.c()).isAfter(Instant.ofEpochMilli(a()).plus(Duration.ofDays(this.l.a())))))) {
                    return true;
                }
            }
            if (attpVar.f.isEmpty()) {
                return N(attpVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.agvl, defpackage.agvq
    public final boolean n() {
        return true;
    }
}
