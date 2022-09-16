package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aenf  reason: default package */
/* loaded from: classes.dex */
public final class aenf {
    private final String c;
    private final String d;
    private final aflm e;
    private final aeha f;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private pvo l;
    private aflk m;
    private aflj n;
    private final HashMap b = new HashMap();
    public final HashMap a = new HashMap();
    private final Set g = new HashSet();
    private volatile boolean o = true;
    private boolean p = false;

    public aenf(String str, String str2, aflm aflmVar, aeha aehaVar) {
        this.c = str;
        this.d = str2;
        this.e = aflmVar;
        this.f = aehaVar;
    }

    private final synchronized aegu k(String str, VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, boolean z2, aetv aetvVar) {
        if (!TextUtils.equals(this.c, str)) {
            String str2 = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 16 + String.valueOf(str).length());
            sb.append("c.cpn_mismatch.");
            sb.append(str2);
            sb.append(".");
            sb.append(str);
            l(aetvVar, sb.toString());
            return null;
        } else if (!TextUtils.equals(this.d, videoStreamingData.c)) {
            l(aetvVar, "c.content_id_mismatch");
            return null;
        } else if (this.p) {
            l(aetvVar, "c.streaming_data_already_added");
            return null;
        } else {
            pvo pvoVar = this.l;
            if (pvoVar == null) {
                l(aetvVar, "c.late_track_selection");
                return null;
            }
            HashSet hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            for (FormatStreamModel formatStreamModel : videoStreamingData.p) {
                if (formatStreamModel.e() != -1) {
                    hashSet.add(formatStreamModel);
                    hashMap.put(formatStreamModel.e, formatStreamModel);
                } else {
                    String valueOf = String.valueOf(formatStreamModel.e);
                    l(aetvVar, valueOf.length() != 0 ? "c.unknown_itag.".concat(valueOf) : new String("c.unknown_itag."));
                    return null;
                }
            }
            aflk aflkVar = this.m;
            if (aflkVar == null) {
                l(aetvVar, "c.null_track_selector_candidate_video_itags");
                return null;
            } else if (this.n == null) {
                l(aetvVar, "c.null_track_selector_candidate_audio_itags");
                return null;
            } else {
                if (!z) {
                    aflkVar = afll.e;
                }
                int i = this.m.c;
                int i2 = aflkVar.c;
                if (i != i2) {
                    String a = afmg.a(i);
                    String a2 = afmg.a(aflkVar.c);
                    StringBuilder sb2 = new StringBuilder(a.length() + 55 + a2.length());
                    sb2.append("c.non_matching_video_track_renderer_types;trt_1.");
                    sb2.append(a);
                    sb2.append(";trt_2.");
                    sb2.append(a2);
                    l(aetvVar, sb2.toString());
                    return null;
                }
                try {
                    aegu c = this.f.c(playerConfigModel, hashSet, null, aflkVar.a, this.n.a, agpr.l(i2 == 3, 16) | 4, afca.c(videoStreamingData, z2), this.c, aeub.a);
                    HashSet<String> hashSet2 = new HashSet();
                    for (FormatStreamModel formatStreamModel2 : c.a) {
                        hashSet2.add(formatStreamModel2.e);
                    }
                    for (FormatStreamModel formatStreamModel3 : c.b) {
                        hashSet2.add(formatStreamModel3.e);
                    }
                    for (String str3 : hashSet2) {
                        FormatStreamModel formatStreamModel4 = (FormatStreamModel) hashMap.get(str3);
                        if (formatStreamModel4 != null) {
                            this.a.put(str3, formatStreamModel4);
                        } else {
                            String valueOf2 = String.valueOf(str3);
                            l(aetvVar, valueOf2.length() != 0 ? "c.null_selected_format_stream;id.".concat(valueOf2) : new String("c.null_selected_format_stream;id."));
                            return null;
                        }
                    }
                    for (String str4 : hashSet2) {
                        int a3 = ovm.a(str4);
                        if (!this.g.contains(Integer.valueOf(a3))) {
                            StringBuilder sb3 = new StringBuilder(55);
                            sb3.append("c.selector_result_does_not_contain_fmt;itag.");
                            sb3.append(a3);
                            l(aetvVar, sb3.toString());
                            return null;
                        }
                    }
                    for (FormatStreamModel formatStreamModel5 : this.b.values()) {
                        FormatStreamModel formatStreamModel6 = (FormatStreamModel) this.a.get(formatStreamModel5.e);
                        if (formatStreamModel6 != null) {
                            if (formatStreamModel5.k() != formatStreamModel6.k()) {
                                long k = formatStreamModel5.k();
                                long k2 = formatStreamModel6.k();
                                StringBuilder sb4 = new StringBuilder(66);
                                sb4.append("c.lmt_mismatch;lmt1.");
                                sb4.append(k);
                                sb4.append(";lmt2.");
                                sb4.append(k2);
                                l(aetvVar, sb4.toString());
                                return null;
                            }
                        } else {
                            String str5 = "";
                            for (String str6 : this.a.keySet()) {
                                String valueOf3 = String.valueOf(str5);
                                if (str5.length() > 0) {
                                    String valueOf4 = String.valueOf(str6);
                                    str6 = valueOf4.length() != 0 ? ".".concat(valueOf4) : new String(".");
                                }
                                String valueOf5 = String.valueOf(str6);
                                str5 = valueOf5.length() != 0 ? valueOf3.concat(valueOf5) : new String(valueOf3);
                            }
                            int e = formatStreamModel5.e();
                            StringBuilder sb5 = new StringBuilder(String.valueOf(str5).length() + 58);
                            sb5.append("c.incompatible_null_fmt;itag.");
                            sb5.append(e);
                            sb5.append(";fmt_stream_itags.");
                            sb5.append(str5);
                            l(aetvVar, sb5.toString());
                            return null;
                        }
                    }
                    int i3 = 0;
                    while (true) {
                        pvf[] pvfVarArr = pvoVar.c;
                        if (i3 >= pvfVarArr.length) {
                            this.p = true;
                            return c;
                        }
                        pvf pvfVar = pvfVarArr[i3];
                        if (pvfVar != null) {
                            for (int i4 = 0; i4 < pvfVar.m(); i4++) {
                                if (!this.a.containsKey(pvfVar.n(i4).a)) {
                                }
                            }
                            l(aetvVar, "selection_does_not_contain_streaming_data_fmt");
                            return null;
                        }
                        i3++;
                    }
                } catch (aegw e2) {
                    String valueOf6 = String.valueOf(e2.getMessage());
                    l(aetvVar, valueOf6.length() != 0 ? "c.missing_stream_exception;".concat(valueOf6) : new String("c.missing_stream_exception;"));
                    return null;
                }
            }
        }
    }

    private static final void l(aetv aetvVar, String str) {
        aetvVar.g(new afkn("onesie.mismatch", 0L, str));
    }

    public final synchronized avg a(String str) {
        int a = ovm.a(str);
        Set b = aank.b();
        Integer valueOf = Integer.valueOf(a);
        if (b.contains(valueOf)) {
            if (!this.h) {
                this.e.v();
                this.h = true;
            }
        } else if (!aank.c().contains(valueOf)) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Invalid EMP itag: ");
            sb.append(a);
            aeny.g(sb.toString());
        } else if (!this.j) {
            this.e.z();
            this.j = true;
        }
        while (this.o && !this.p && !this.a.containsKey(str)) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                aeny.j("Interrupted while waiting for streaming data representation.", e);
                this.o = false;
                notifyAll();
            }
        }
        int a2 = ovm.a(str);
        Set b2 = aank.b();
        Integer valueOf2 = Integer.valueOf(a2);
        if (b2.contains(valueOf2)) {
            if (!this.i) {
                this.e.u();
                this.i = true;
            }
        } else if (!aank.c().contains(valueOf2)) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid EMP itag: ");
            sb2.append(a2);
            aeny.g(sb2.toString());
        } else if (!this.k) {
            this.e.y();
            this.k = true;
        }
        FormatStreamModel formatStreamModel = (FormatStreamModel) this.a.get(str);
        if (this.o && formatStreamModel != null) {
            return formatStreamModel.R(this.c);
        }
        return null;
    }

    public final synchronized avg b(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.containsKey(str)) {
            return ((FormatStreamModel) this.a.get(str)).R(this.c);
        } else if (!this.b.containsKey(str)) {
            return null;
        } else {
            return ((FormatStreamModel) this.b.get(str)).R(this.c);
        }
    }

    public final synchronized aegu c(String str, VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, boolean z2, aetv aetvVar) {
        aegu k;
        k = k(str, videoStreamingData, playerConfigModel, z, z2, aetvVar);
        if (k == null || !this.o) {
            this.o = false;
            throw new aene();
        }
        notifyAll();
        return k;
    }

    public final synchronized void d() {
        this.o = false;
        notifyAll();
    }

    public final synchronized void e(pvo pvoVar, aflk aflkVar, aflj afljVar) {
        this.l = pvoVar;
        this.m = aflkVar;
        this.n = afljVar;
        if (pvoVar != null) {
            int i = 0;
            while (true) {
                pvf[] pvfVarArr = pvoVar.c;
                if (i >= pvfVarArr.length) {
                    return;
                }
                pvf pvfVar = pvfVarArr[i];
                if (pvfVar != null) {
                    for (int i2 = 0; i2 < pvfVar.m(); i2++) {
                        this.g.add(Integer.valueOf(ovm.a(pvfVar.n(i2).a)));
                    }
                }
                i++;
            }
        }
    }

    public final synchronized boolean f(String str) {
        boolean z;
        if (!this.b.containsKey(str)) {
            if (!this.a.containsKey(str)) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized boolean g(Set set) {
        boolean z;
        Iterator it = this.b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (set.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        return z;
    }

    public final synchronized boolean h() {
        return this.p;
    }

    public final synchronized boolean i() {
        return this.o;
    }

    public final synchronized void j(String str, int i, String str2, long j, int i2) {
        String concat;
        String b = ovm.b(i, str2);
        aopc aopcVar = (aopc) aqzx.b.createBuilder();
        if (TextUtils.isEmpty(str2)) {
            concat = "";
        } else {
            String valueOf = String.valueOf(str2);
            concat = valueOf.length() != 0 ? "&xtags=".concat(valueOf) : new String("&xtags=");
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(concat).length());
        sb.append("http://oda/videoplayback?id=");
        sb.append(str);
        sb.append("&itag=");
        sb.append(i);
        sb.append("&lmt=");
        sb.append(j);
        sb.append(concat);
        String sb2 = sb.toString();
        aopcVar.copyOnWrite();
        aqzx aqzxVar = (aqzx) aopcVar.instance;
        sb2.getClass();
        aqzxVar.c |= 2;
        aqzxVar.e = sb2;
        aopcVar.copyOnWrite();
        aqzx aqzxVar2 = (aqzx) aopcVar.instance;
        aqzxVar2.c |= 1;
        aqzxVar2.d = i;
        aopcVar.copyOnWrite();
        aqzx aqzxVar3 = (aqzx) aopcVar.instance;
        str2.getClass();
        aqzxVar3.c |= 8192;
        aqzxVar3.q = str2;
        aopa createBuilder = aqzy.a.createBuilder();
        createBuilder.copyOnWrite();
        aqzy aqzyVar = (aqzy) createBuilder.instance;
        aqzyVar.b |= 4;
        aqzyVar.c = 0L;
        createBuilder.copyOnWrite();
        aqzy aqzyVar2 = (aqzy) createBuilder.instance;
        aqzyVar2.b |= 8;
        aqzyVar2.d = 1L;
        aopcVar.copyOnWrite();
        aqzx aqzxVar4 = (aqzx) aopcVar.instance;
        aqzy aqzyVar3 = (aqzy) createBuilder.mo39build();
        aqzyVar3.getClass();
        aqzxVar4.m = aqzyVar3;
        aqzxVar4.c |= 256;
        aopa createBuilder2 = aqzy.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqzy aqzyVar4 = (aqzy) createBuilder2.instance;
        aqzyVar4.b |= 4;
        aqzyVar4.c = 2L;
        createBuilder2.copyOnWrite();
        aqzy aqzyVar5 = (aqzy) createBuilder2.instance;
        aqzyVar5.b |= 8;
        aqzyVar5.d = i2;
        aopcVar.copyOnWrite();
        aqzx aqzxVar5 = (aqzx) aopcVar.instance;
        aqzy aqzyVar6 = (aqzy) createBuilder2.mo39build();
        aqzyVar6.getClass();
        aqzxVar5.n = aqzyVar6;
        aqzxVar5.c |= 512;
        aopcVar.copyOnWrite();
        aqzx aqzxVar6 = (aqzx) aopcVar.instance;
        aqzxVar6.c |= 1024;
        aqzxVar6.o = j;
        aopcVar.copyOnWrite();
        aqzx aqzxVar7 = (aqzx) aopcVar.instance;
        aqzxVar7.c |= 2048;
        aqzxVar7.p = -1L;
        this.b.put(b, new FormatStreamModel((aqzx) aopcVar.mo39build(), str, -1L));
        notifyAll();
    }
}
