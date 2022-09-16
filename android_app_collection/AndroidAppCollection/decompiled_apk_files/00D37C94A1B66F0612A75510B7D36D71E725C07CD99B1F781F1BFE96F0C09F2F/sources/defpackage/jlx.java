package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: jlx  reason: default package */
/* loaded from: classes3.dex */
public final class jlx extends jlq {
    public final aadd a;
    private final Context b;
    private final azqb c;

    public jlx(Context context, aadd aaddVar, azqb azqbVar) {
        super(jbe.class, audg.class);
        this.b = context;
        this.a = aaddVar;
        this.c = azqbVar;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        ArrayList arrayList;
        jlx jlxVar = this;
        jbe jbeVar = (jbe) obj;
        int intValue = ((Integer) e(amupVar, "downloaded_playlist_selected_video_index")).intValue();
        String str = (String) e(amupVar, "watch_command_params");
        aoob aoobVar = (aoob) e(amupVar, "watch_command_click_tracking_params");
        int size = eog.N(jlxVar.a) ? jbeVar.f : jbeVar.e.size();
        aopc aopcVar = (aopc) audg.a.createBuilder();
        String str2 = jbeVar.a;
        aopcVar.copyOnWrite();
        audg audgVar = (audg) aopcVar.instance;
        str2.getClass();
        audgVar.c |= 32;
        audgVar.k = str2;
        aopcVar.copyOnWrite();
        audg audgVar2 = (audg) aopcVar.instance;
        audgVar2.c |= 8;
        audgVar2.j = intValue;
        aopcVar.copyOnWrite();
        audg audgVar3 = (audg) aopcVar.instance;
        audgVar3.c |= 64;
        audgVar3.m = size;
        int i = 0;
        arag g = ajgl.g(jlxVar.b.getResources().getQuantityString(R.plurals.playlist_size, size, Integer.valueOf(size)));
        aopcVar.copyOnWrite();
        audg audgVar4 = (audg) aopcVar.instance;
        g.getClass();
        audgVar4.n = g;
        audgVar4.c |= 128;
        if (!TextUtils.isEmpty(jbeVar.b)) {
            String str3 = jbeVar.b;
            aopcVar.copyOnWrite();
            audg audgVar5 = (audg) aopcVar.instance;
            str3.getClass();
            audgVar5.c |= 1;
            audgVar5.g = str3;
        }
        if (!TextUtils.isEmpty(jbeVar.c)) {
            arag h = ajgl.h(jbeVar.c);
            aopcVar.copyOnWrite();
            audg audgVar6 = (audg) aopcVar.instance;
            h.getClass();
            audgVar6.q = h;
            audgVar6.c |= 2048;
        }
        if (jbeVar.d.isPresent()) {
            aopcVar.copyOnWrite();
            audg audgVar7 = (audg) aopcVar.instance;
            audgVar7.B = (arhs) jbeVar.d.get();
            audgVar7.d |= 1;
        }
        String str4 = jbeVar.a;
        amuk amukVar = jbeVar.e;
        ArrayList arrayList2 = new ArrayList();
        while (i < amukVar.size()) {
            int i2 = intValue;
            jbe jbeVar2 = jbeVar;
            aopc aopcVar2 = aopcVar;
            int i3 = i;
            ArrayList arrayList3 = arrayList2;
            amuk amukVar2 = amukVar;
            String str5 = str4;
            String str6 = str;
            Optional ofNullable = Optional.ofNullable((audk) ((jml) jlxVar.c.get()).g(jbc.class, audk.class, (jbc) amukVar.get(i), amup.o("downloaded_video_playlist_id", str4, "downloaded_video_list_index", Integer.valueOf(i), "downloaded_playlist_selected_video_index", Integer.valueOf(intValue), "watch_command_params", str, "watch_command_click_tracking_params", aoobVar)));
            if (ofNullable.isPresent()) {
                aopa createBuilder = audf.a.createBuilder();
                createBuilder.copyOnWrite();
                audf audfVar = (audf) createBuilder.instance;
                audfVar.c = (audk) ofNullable.get();
                audfVar.b |= 1;
                arrayList = arrayList3;
                arrayList.add((audf) createBuilder.mo39build());
            } else {
                arrayList = arrayList3;
            }
            i = i3 + 1;
            jlxVar = this;
            intValue = i2;
            aopcVar = aopcVar2;
            arrayList2 = arrayList;
            amukVar = amukVar2;
            jbeVar = jbeVar2;
            str4 = str5;
            str = str6;
        }
        aopc aopcVar3 = aopcVar;
        aopcVar3.copyOnWrite();
        audg audgVar8 = (audg) aopcVar3.instance;
        audgVar8.a();
        aonk.addAll((Iterable) arrayList2, (List) audgVar8.i);
        jbeVar.g.filter(new Predicate() { // from class: jlw
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return predicate.getClass();
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return predicate.getClass();
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj2) {
                arag aragVar = (arag) obj2;
                return eog.N(jlx.this.a);
            }
        }).ifPresent(new jmb(aopcVar3, 1));
        return (audg) aopcVar3.mo39build();
    }
}
