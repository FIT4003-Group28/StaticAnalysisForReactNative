package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: agvl  reason: default package */
/* loaded from: classes.dex */
public class agvl implements agvq {
    static final attl c = attl.SD;
    public static final /* synthetic */ int h = 0;
    private final amuk a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    protected final SharedPreferences d;
    protected final aadd e;
    protected final agvn f;
    public final amuk g;

    public agvl(SharedPreferences sharedPreferences, aadd aaddVar, int i, agvn agvnVar) {
        this.d = sharedPreferences;
        this.e = aaddVar;
        this.f = agvnVar;
        ArrayList arrayList = new ArrayList();
        for (attl attlVar : ahdp.g.keySet()) {
            if (ahdp.a(attlVar, 0) <= i) {
                arrayList.add(attlVar);
            }
        }
        amuk o = amuk.o(arrayList);
        this.a = o;
        ArrayList arrayList2 = new ArrayList();
        if (o.contains(attl.LD)) {
            arrayList2.add(attl.LD);
        }
        if (o.contains(attl.SD)) {
            arrayList2.add(attl.SD);
        }
        if (o.contains(attl.HD)) {
            arrayList2.add(attl.HD);
        }
        this.g = amuk.o(arrayList2);
    }

    private static String a(String str) {
        return zhn.q("offline_auto_offline_interval_%s", str);
    }

    private static String g(String str) {
        return zhn.q("offline_resync_interval_%s", str);
    }

    @Override // defpackage.agvq
    public final void B(String str, long j) {
        this.d.edit().putLong(zhn.q("last_offline_video_playback_position_sync_timestamp_%s", str), j).apply();
    }

    @Override // defpackage.agvq
    public final void C(String str, long j) {
        this.d.edit().putLong(zhn.q("offline_auto_offline_execution_window_%s", str), j).apply();
    }

    @Override // defpackage.agvq
    public final void D(String str, long j) {
        ylx.m(this.f.a.b(new wdy(str, j, 4)), afsc.l);
    }

    @Override // defpackage.agvq
    public final void E(attl attlVar) {
        aqxo.p(attlVar != attl.UNKNOWN_FORMAT_TYPE);
        int a = ahdp.a(attlVar, -1);
        if (a != -1) {
            this.d.edit().putString(agks.QUALITY, Integer.toString(a)).apply();
        }
    }

    @Override // defpackage.agvq
    public final void F(String str, long j) {
        this.d.edit().putLong(a(str), j).apply();
    }

    @Override // defpackage.agvq
    public final void G(String str, long j) {
        this.d.edit().putLong(g(str), j).apply();
    }

    @Override // defpackage.agvq
    public final void H(boolean z) {
        this.d.edit().putBoolean("offline_use_sd_card", z).apply();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((agvp) it.next()).j();
        }
    }

    @Override // defpackage.agvq
    public final void I(String str, boolean z) {
        this.d.edit().putBoolean(zhn.q("should_record_offline_playback_last_position_%s", str), z).apply();
    }

    @Override // defpackage.agvq
    public final boolean J() {
        return this.g.size() > 1;
    }

    @Override // defpackage.agvq
    public final boolean K(String str) {
        return this.d.getBoolean(zhn.q("should_record_offline_playback_last_position_%s", str), true);
    }

    @Override // defpackage.agvq
    public final boolean L() {
        return this.f.b();
    }

    @Override // defpackage.agvq
    public final boolean M(String str, String str2) {
        String q = zhn.q("offline_identity_nonce_mapping_%s", str);
        if (!this.d.edit().putString(q, str2).commit()) {
            this.d.edit().remove(q).apply();
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean N(attp attpVar) {
        if (!J()) {
            return false;
        }
        attl v = v(attl.UNKNOWN_FORMAT_TYPE);
        return v == attl.UNKNOWN_FORMAT_TYPE || !agqb.d(attpVar).containsKey(v);
    }

    @Override // defpackage.agvq
    public final boolean O() {
        return this.d.getBoolean(agks.PLAYLIST_WARNING, true);
    }

    @Override // defpackage.agvq
    public final boolean P() {
        return this.d.getBoolean("offline_use_sd_card", true);
    }

    @Override // defpackage.agvq
    public final void Q() {
    }

    @Override // defpackage.agvq
    public final void R(agvp agvpVar) {
        this.b.remove(agvpVar);
    }

    @Override // defpackage.agvq
    public final void S() {
        this.d.edit().putBoolean(agks.PLAYLIST_WARNING, false).apply();
    }

    @Override // defpackage.agvq
    public final void T() {
    }

    @Override // defpackage.agvq
    public final int U(attl attlVar) {
        atqv atqvVar = this.e.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        if (atqvVar.m) {
            attl attlVar2 = attl.UNKNOWN_FORMAT_TYPE;
            switch (attlVar.ordinal()) {
                case 1:
                case 5:
                    return 2;
                case 2:
                case 6:
                    return 3;
                case 3:
                case 7:
                case 8:
                case 9:
                    return 4;
                case 4:
                default:
                    return 1;
            }
        }
        return 1;
    }

    @Override // defpackage.agvq
    public ampt b() {
        return zto.n;
    }

    @Override // defpackage.agvq
    public ampt c() {
        return zto.o;
    }

    @Override // defpackage.agvq
    public amuk d() {
        return this.g;
    }

    @Override // defpackage.agvq
    public Comparator e() {
        return ahdp.e;
    }

    @Override // defpackage.agvq
    public Comparator f() {
        return ahdp.c;
    }

    @Override // defpackage.agvq
    public boolean l() {
        return this.d.getBoolean(agks.WIFI_POLICY, false);
    }

    @Override // defpackage.agvq
    public boolean m(attp attpVar, atpy atpyVar) {
        return N(attpVar);
    }

    @Override // defpackage.agvq
    public boolean n() {
        return false;
    }

    @Override // defpackage.agvq
    public final long o(String str) {
        return this.d.getLong(zhn.q("last_offline_video_playback_position_sync_timestamp_%s", str), 0L);
    }

    @Override // defpackage.agvq
    public final long p(String str) {
        awuz awuzVar = awuz.a;
        aoqp aoqpVar = ((awvb) this.f.a.c()).d;
        if (aoqpVar.containsKey(str)) {
            awuzVar = (awuz) aoqpVar.get(str);
        }
        return awuzVar.c;
    }

    @Override // defpackage.agvq
    public final long q(String str) {
        return this.d.getLong(a(str), 0L);
    }

    @Override // defpackage.agvq
    public final long r(String str) {
        return this.d.getLong(g(str), 0L);
    }

    @Override // defpackage.agvq
    public final amuk s() {
        return this.a;
    }

    @Override // defpackage.agvq
    public final ankt t(final awuy awuyVar) {
        return this.f.b.b(new ampg() { // from class: agvm
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                awuy awuyVar2 = awuy.this;
                aopa mo52toBuilder = ((awvb) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                awvb awvbVar = (awvb) mo52toBuilder.instance;
                awvbVar.c = awuyVar2.e;
                awvbVar.b |= 1;
                return (awvb) mo52toBuilder.mo39build();
            }
        });
    }

    @Override // defpackage.agvq
    public final attl u() {
        return v(c);
    }

    public final attl v(attl attlVar) {
        String string = this.d.getString(agks.QUALITY, null);
        if (string != null) {
            try {
                int parseInt = Integer.parseInt(string);
                amzt listIterator = this.a.listIterator();
                while (listIterator.hasNext()) {
                    attl attlVar2 = (attl) listIterator.next();
                    if (ahdp.a(attlVar2, -1) == parseInt) {
                        return attlVar2;
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        return attlVar;
    }

    @Override // defpackage.agvq
    public final awuy w() {
        if (this.f.b()) {
            awuy b = awuy.b(((awvb) this.f.b.c()).c);
            if (b == null) {
                b = awuy.UNKNOWN;
            }
            return b == awuy.UNKNOWN ? awuy.UNMETERED_WIFI_OR_UNMETERED_MOBILE : b;
        } else if (l()) {
            return awuy.UNMETERED_WIFI_OR_UNMETERED_MOBILE;
        } else {
            return awuy.ANY;
        }
    }

    @Override // defpackage.agvq
    public final String x(String str) {
        return this.d.getString(zhn.q("offline_identity_nonce_mapping_%s", str), str);
    }

    @Override // defpackage.agvq
    public final String y(ywa ywaVar) {
        return this.d.getString("video_storage_location_on_sdcard", ywaVar.e(ywaVar.c()));
    }

    @Override // defpackage.agvq
    public final void z(agvp agvpVar) {
        this.b.add(agvpVar);
    }
}
