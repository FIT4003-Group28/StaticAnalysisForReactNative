package defpackage;

import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: jvy  reason: default package */
/* loaded from: classes3.dex */
public final class jvy extends fdm {
    private final yni a;
    private final aypf b;
    private final airw c;
    private final Collection d;
    private final Collection e;
    private final Collection f;
    private final Collection g;
    private final Collection h;
    private final Collection i;
    private final Collection j;
    private final Collection k;
    private final aacz l;

    public jvy(ahkv ahkvVar, azqb azqbVar, yni yniVar, jzb jzbVar, feh fehVar, xfp xfpVar, ahyz ahyzVar, ahyd ahydVar, aibi aibiVar, aicj aicjVar, aian aianVar, aias aiasVar, kfy kfyVar, xgm xgmVar, LiveOverlayPresenter liveOverlayPresenter, ahvu ahvuVar, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aict aictVar, SubtitlesOverlayPresenter subtitlesOverlayPresenter, aiah aiahVar, ahqb ahqbVar, ahqt ahqtVar, aiak aiakVar, jxj jxjVar, jzp jzpVar, MdxOverlaysPresenter mdxOverlaysPresenter, kkh kkhVar, klz klzVar, NoSoundMemoOverlay noSoundMemoOverlay, khk khkVar, kfq kfqVar, aacz aaczVar, airw airwVar, abkf abkfVar) {
        super(fehVar);
        this.a = yniVar;
        this.l = aaczVar;
        this.c = airwVar;
        this.b = new aypf();
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.add(ahkvVar);
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        arrayList2.add(liveOverlayPresenter);
        arrayList2.add(ahqtVar);
        arrayList2.add(ahqbVar);
        arrayList2.add((airt) azqbVar.get());
        arrayList2.add(ahyzVar.O);
        arrayList2.add(jxjVar);
        arrayList2.add(jzpVar);
        ArrayList arrayList3 = new ArrayList();
        this.f = arrayList3;
        arrayList3.add(subtitlesOverlayPresenter);
        arrayList3.add(ahydVar);
        arrayList3.add(aiakVar);
        arrayList3.add(aibiVar);
        arrayList3.add(aicjVar);
        arrayList3.add(aianVar);
        arrayList3.add(aiasVar);
        ArrayList arrayList4 = new ArrayList();
        this.g = arrayList4;
        arrayList4.add(aiahVar.n);
        arrayList4.add(ahvuVar.r);
        arrayList4.add(creatorEndscreenOverlayPresenter.r);
        arrayList4.add(aictVar.a);
        ArrayList arrayList5 = new ArrayList();
        this.h = arrayList5;
        arrayList5.add(jzbVar);
        ArrayList arrayList6 = new ArrayList();
        this.i = arrayList6;
        arrayList6.add(noSoundMemoOverlay);
        arrayList6.add(kfyVar);
        ArrayList arrayList7 = new ArrayList();
        this.j = arrayList7;
        arrayList7.add(xfpVar);
        arrayList7.add(xgmVar);
        ArrayList arrayList8 = new ArrayList();
        this.k = arrayList8;
        arrayList8.add(ahvuVar.b());
        arrayList8.add(creatorEndscreenOverlayPresenter.s);
        arrayList8.add(aictVar.b);
        arrayList8.add(ahyzVar.P);
        arrayList8.add(aiahVar.o);
        arrayList8.add(mdxOverlaysPresenter);
        arrayList8.add(kkhVar);
        arrayList8.add(klzVar);
        arrayList8.add(khkVar);
        arrayList8.add(kfqVar);
        arrayList8.add(liveOverlayPresenter.h);
        arrayList8.add(abkfVar);
    }

    private final void a(boolean z, Collection collection) {
        if (z) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.b.g(((airt) it.next()).g(this.c));
            }
            return;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            this.a.g((airt) it2.next());
        }
    }

    private final void d(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aypg[] g = ((airt) it.next()).g(this.c);
            if (g != null) {
                this.b.g(g);
            }
        }
    }

    private final void e(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.b.g(((airt) it.next()).g(this.c));
        }
    }

    @Override // defpackage.feg
    public final void kF() {
        this.b.c();
        ArrayList arrayList = new ArrayList();
        if (!eog.ap(this.l)) {
            arrayList.addAll(this.h);
        }
        if (!eog.aq(this.l)) {
            arrayList.addAll(this.i);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.a.m((airt) arrayList.get(i));
        }
        for (Object obj : this.k) {
            this.a.m(obj);
        }
    }

    @Override // defpackage.feg
    public final void nr() {
        a(eog.ap(this.l), this.h);
        a(eog.aq(this.l), this.i);
        e(this.d);
        e(this.j);
        d(this.e);
        d(this.f);
        d(this.g);
        for (Object obj : this.k) {
            this.a.g(obj);
        }
    }
}
