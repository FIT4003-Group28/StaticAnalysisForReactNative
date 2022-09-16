package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.protos.youtube.api.innertube.DecoratedPlayerBarRendererOuterClass;
import com.google.protos.youtube.api.innertube.HeatMarkerRendererOuterClass;
import com.google.protos.youtube.api.innertube.HeatmapRendererOuterClass;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: kev  reason: default package */
/* loaded from: classes3.dex */
public final class kev extends fdm implements ezb, kbk, ynl {
    private final ahwz a;
    private final ahwo b;
    private final yni c;
    private final ezd d;

    public kev(feh fehVar, yni yniVar, ahwz ahwzVar, ezd ezdVar, ahwo ahwoVar, kbl kblVar) {
        super(fehVar);
        this.c = yniVar;
        this.a = ahwzVar;
        this.d = ezdVar;
        this.b = ahwoVar;
        kblVar.a(this);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.ezb
    public final void h(ezw ezwVar) {
        ahwz ahwzVar = this.a;
        ahwzVar.d.clear();
        for (aicb aicbVar : ahwzVar.a.keySet()) {
            ahwzVar.f(null, aicbVar, 1, (TimelineMarker) ahwzVar.b.get(aicbVar));
        }
        ahwzVar.c.clear();
        ahwzVar.b.clear();
        ahwzVar.e.clear();
        ahwzVar.f.clear();
        ahwzVar.j = Optional.empty();
        ahwzVar.i = Optional.empty();
        ahwzVar.g.a(amuk.q());
    }

    @Override // defpackage.kbk
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        this.a.k = ControlsOverlayStyle.a(controlsOverlayStyle);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.feg
    public final void kF() {
        this.c.m(this);
        this.a.l(aicb.CHAPTER, this.b);
        this.a.l(aicb.TIMESTAMP_MARKER, this.b);
        this.d.h(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        Class[] clsArr;
        Optional empty;
        apzg apzgVar;
        float f;
        float f2;
        String str;
        apzg apzgVar2;
        String str2;
        TimelineMarker timelineMarker;
        apzg apzgVar3;
        String str3;
        int i2 = 1;
        int i3 = 0;
        if (i != -1) {
            if (i == 0) {
                ahhm ahhmVar = (ahhm) obj;
                if (ahhmVar.a() == null) {
                    return null;
                }
                aube aubeVar = ahhmVar.a().i;
                if (aubeVar != null) {
                    aunb aunbVar = aubeVar.q;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    aqks aqksVar = (aqks) aunbVar.qm(DecoratedPlayerBarRendererOuterClass.decoratedPlayerBarRenderer);
                    aunb aunbVar2 = aqksVar.c;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    if (aunbVar2.qn(DecoratedPlayerBarRendererOuterClass.multiMarkersPlayerBarRenderer)) {
                        aunb aunbVar3 = aqksVar.c;
                        if (aunbVar3 == null) {
                            aunbVar3 = aunb.a;
                        }
                        aqkv aqkvVar = (aqkv) aunbVar3.qm(DecoratedPlayerBarRendererOuterClass.multiMarkersPlayerBarRenderer);
                        for (Map.Entry entry : Collections.unmodifiableMap(aqkvVar.d).entrySet()) {
                            if ((((aqkr) entry.getValue()).b & 2) != 0) {
                                apzgVar = ((aqkr) entry.getValue()).f;
                                if (apzgVar == null) {
                                    apzgVar = apzg.a;
                                }
                            } else {
                                apzgVar = null;
                            }
                            aqkr aqkrVar = (aqkr) entry.getValue();
                            int size = aqkrVar.c.size();
                            TimelineMarker[] timelineMarkerArr = new TimelineMarker[size];
                            int i4 = 0;
                            while (i4 < size) {
                                aqkq aqkqVar = (aqkq) ((aunb) aqkrVar.c.get(i4)).qm(DecoratedPlayerBarRendererOuterClass.chapterRenderer);
                                int i5 = i4 + 1;
                                aqkq aqkqVar2 = i5 < size ? (aqkq) ((aunb) aqkrVar.c.get(i5)).qm(DecoratedPlayerBarRendererOuterClass.chapterRenderer) : null;
                                Map.Entry entry2 = entry;
                                long j = aqkqVar.d;
                                long j2 = aqkqVar2 != null ? aqkqVar2.d : Long.MAX_VALUE;
                                if ((aqkqVar.b & 8) != 0) {
                                    apzg apzgVar4 = aqkqVar.e;
                                    if (apzgVar4 == null) {
                                        apzgVar4 = apzg.a;
                                    }
                                    apzgVar3 = apzgVar4;
                                } else {
                                    apzgVar3 = null;
                                }
                                arag aragVar = aqkqVar.c;
                                if (aragVar == null) {
                                    aragVar = arag.a;
                                }
                                if (aragVar.c.size() > 0) {
                                    arag aragVar2 = aqkqVar.c;
                                    if (aragVar2 == null) {
                                        aragVar2 = arag.a;
                                    }
                                    str3 = ((arai) aragVar2.c.get(i3)).c;
                                } else {
                                    str3 = null;
                                }
                                int i6 = i4;
                                timelineMarkerArr[i6] = new TimelineMarker(j, j2, i6, str3, apzgVar3);
                                entry = entry2;
                                i4 = i5;
                            }
                            Map.Entry entry3 = entry;
                            if (size > 0) {
                                this.a.k((String) entry3.getKey(), aicb.CHAPTER, timelineMarkerArr, apzgVar);
                            }
                            aqkr aqkrVar2 = (aqkr) entry3.getValue();
                            int size2 = aqkrVar2.d.size();
                            TimelineMarker[] timelineMarkerArr2 = new TimelineMarker[size2];
                            int i7 = 0;
                            while (true) {
                                f = 1.0f;
                                f2 = 0.0f;
                                if (i7 >= size2) {
                                    break;
                                }
                                aqkt aqktVar = (aqkt) ((aunb) aqkrVar2.d.get(i7)).qm(DecoratedPlayerBarRendererOuterClass.markerRenderer);
                                if ((aqktVar.b & 16) == 0) {
                                    timelineMarkerArr2 = new TimelineMarker[i3];
                                    break;
                                }
                                timelineMarkerArr2[i7] = new TimelineMarker(aqktVar.d, zgd.N((float) aqktVar.f, 0.0f, 1.0f));
                                i7++;
                            }
                            if (timelineMarkerArr2.length > 0) {
                                this.a.k((String) entry3.getKey(), aicb.HEATMAP_MARKER, timelineMarkerArr2, apzgVar);
                            } else {
                                aqkr aqkrVar3 = (aqkr) entry3.getValue();
                                int size3 = aqkrVar3.d.size();
                                TimelineMarker[] timelineMarkerArr3 = new TimelineMarker[size3];
                                for (int i8 = 0; i8 < size3; i8++) {
                                    aqkt aqktVar2 = (aqkt) ((aunb) aqkrVar3.d.get(i8)).qm(DecoratedPlayerBarRendererOuterClass.markerRenderer);
                                    long j3 = aqktVar2.d;
                                    arag aragVar3 = aqktVar2.c;
                                    if (aragVar3 == null) {
                                        aragVar3 = arag.a;
                                    }
                                    if (aragVar3.c.size() > 0) {
                                        arag aragVar4 = aqktVar2.c;
                                        if (aragVar4 == null) {
                                            aragVar4 = arag.a;
                                        }
                                        str = ((arai) aragVar4.c.get(i3)).c;
                                    } else {
                                        str = null;
                                    }
                                    if ((aqktVar2.b & 8) != 0) {
                                        apzg apzgVar5 = aqktVar2.e;
                                        if (apzgVar5 == null) {
                                            apzgVar5 = apzg.a;
                                        }
                                        apzgVar2 = apzgVar5;
                                    } else {
                                        apzgVar2 = null;
                                    }
                                    timelineMarkerArr3[i8] = new TimelineMarker(j3, j3, i8, str, apzgVar2);
                                }
                                if (size3 > 0) {
                                    this.a.k((String) entry3.getKey(), aicb.TIMESTAMP_MARKER, timelineMarkerArr3, apzgVar);
                                }
                            }
                            String str4 = (String) entry3.getKey();
                            aqkr aqkrVar4 = (aqkr) entry3.getValue();
                            if ((aqkrVar4.b & i2) != 0) {
                                aunb aunbVar4 = aqkrVar4.e;
                                if (aunbVar4 == null) {
                                    aunbVar4 = aunb.a;
                                }
                                if (aunbVar4.qn(HeatmapRendererOuterClass.heatmapRenderer)) {
                                    aunb aunbVar5 = aqkrVar4.e;
                                    if (aunbVar5 == null) {
                                        aunbVar5 = aunb.a;
                                    }
                                    arfz arfzVar = (arfz) aunbVar5.qm(HeatmapRendererOuterClass.heatmapRenderer);
                                    int size4 = arfzVar.b.size();
                                    ArrayList arrayList = new ArrayList(size4);
                                    int i9 = 0;
                                    while (i9 < size4) {
                                        arfy arfyVar = (arfy) ((aunb) arfzVar.b.get(i9)).qm(HeatMarkerRendererOuterClass.heatMarkerRenderer);
                                        float N = zgd.N((float) arfyVar.d, f2, f);
                                        if ((arfyVar.b & 8) == 0) {
                                            timelineMarker = new TimelineMarker(arfyVar.c, N);
                                        } else {
                                            long j4 = arfyVar.c;
                                            apzg apzgVar6 = arfyVar.e;
                                            if (apzgVar6 == null) {
                                                apzgVar6 = apzg.a;
                                            }
                                            timelineMarker = new TimelineMarker(j4, j4, 0, null, apzgVar6, N);
                                        }
                                        arrayList.add(timelineMarker);
                                        i9++;
                                        f = 1.0f;
                                        f2 = 0.0f;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (aunb aunbVar6 : arfzVar.c) {
                                        if (aunbVar6.qn(avie.a)) {
                                            avid avidVar = (avid) aunbVar6.qm(avie.a);
                                            arag aragVar5 = avidVar.e;
                                            if (aragVar5 == null) {
                                                aragVar5 = arag.a;
                                            }
                                            if (aragVar5.c.size() > 0) {
                                                arag aragVar6 = avidVar.e;
                                                if (aragVar6 == null) {
                                                    aragVar6 = arag.a;
                                                }
                                                str2 = ((arai) aragVar6.c.get(0)).c;
                                            } else {
                                                str2 = "";
                                            }
                                            ahwv ahwvVar = new ahwv();
                                            ahwvVar.c = Long.valueOf(avidVar.d);
                                            ahwvVar.a = Long.valueOf(avidVar.b);
                                            ahwvVar.b = Long.valueOf(avidVar.c);
                                            arhr b = arhr.b(avidVar.f);
                                            if (b == null) {
                                                b = arhr.UNKNOWN;
                                            }
                                            if (b != null) {
                                                ahwvVar.e = b;
                                                if (str2 != null) {
                                                    ahwvVar.d = str2;
                                                    Long l = ahwvVar.a;
                                                    if (l != null && ahwvVar.b != null && ahwvVar.c != null && ahwvVar.d != null && ahwvVar.e != null) {
                                                        arrayList2.add(new ahww(l.longValue(), ahwvVar.b.longValue(), ahwvVar.c.longValue(), ahwvVar.d, ahwvVar.e));
                                                    } else {
                                                        StringBuilder sb = new StringBuilder();
                                                        if (ahwvVar.a == null) {
                                                            sb.append(" decorationVisibilityStartMillis");
                                                        }
                                                        if (ahwvVar.b == null) {
                                                            sb.append(" decorationVisibilityEndMillis");
                                                        }
                                                        if (ahwvVar.c == null) {
                                                            sb.append(" decorationTimeMillis");
                                                        }
                                                        if (ahwvVar.d == null) {
                                                            sb.append(" label");
                                                        }
                                                        if (ahwvVar.e == null) {
                                                            sb.append(" icon");
                                                        }
                                                        String valueOf = String.valueOf(sb);
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                                                        sb2.append("Missing required properties:");
                                                        sb2.append(valueOf);
                                                        throw new IllegalStateException(sb2.toString());
                                                    }
                                                } else {
                                                    throw new NullPointerException("Null label");
                                                }
                                            } else {
                                                throw new NullPointerException("Null icon");
                                            }
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        this.a.n(str4, aicb.HEATMAP_MARKER, new ahwr(arrayList, arrayList2), apzgVar);
                                    }
                                }
                            }
                            String str5 = (String) entry3.getKey();
                            aqkr aqkrVar5 = (aqkr) entry3.getValue();
                            if ((aqkrVar5.b & 4) != 0) {
                                ahwz ahwzVar = this.a;
                                apzg apzgVar7 = aqkrVar5.g;
                                if (apzgVar7 == null) {
                                    apzgVar7 = apzg.a;
                                }
                                ahwzVar.d(str5, apzgVar7);
                            }
                            i2 = 1;
                            i3 = 0;
                        }
                        ahwz ahwzVar2 = this.a;
                        if ((aqkvVar.b & 1) != 0) {
                            aqkx aqkxVar = aqkvVar.c;
                            if (aqkxVar == null) {
                                aqkxVar = aqkx.a;
                            }
                            empty = Optional.of(aqkxVar.b);
                        } else {
                            empty = Optional.empty();
                        }
                        clsArr = null;
                        if (!TextUtils.equals((CharSequence) empty.orElse(null), (CharSequence) ahwzVar2.i.orElse(null))) {
                            ahwzVar2.i = empty;
                            ahwzVar2.e(true, empty);
                            return null;
                        }
                        return clsArr;
                    }
                }
                clsArr = null;
                return clsArr;
            }
            StringBuilder sb3 = new StringBuilder(32);
            sb3.append("unsupported op code: ");
            sb3.append(i);
            throw new IllegalStateException(sb3.toString());
        }
        return new Class[]{ahhm.class};
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nL(boolean z) {
    }

    @Override // defpackage.feg
    public final void nr() {
        this.c.g(this);
        this.a.i(aicb.CHAPTER, this.b);
        this.a.i(aicb.TIMESTAMP_MARKER, this.b);
        this.d.d(this);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void oe(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void og(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void q(boolean z) {
    }
}
