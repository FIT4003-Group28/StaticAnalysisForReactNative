package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service;

import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideosScreen;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.i;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e implements ynl {
    public aika a;
    public ahia b;
    public aubk c;
    public final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b f;
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d g;
    public final d i;
    public final f j;
    public final rvx k;
    private MutedAutoplayState l;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a m;
    public final azpm d = azpm.aI(false);
    public final aypf e = new aypf();
    public final c h = new c();

    public e(f fVar, aafo aafoVar, rvx rvxVar, com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b bVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d dVar, com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar, byte[] bArr) {
        this.j = fVar;
        this.k = rvxVar;
        this.f = bVar;
        this.g = dVar;
        this.m = aVar;
        this.i = new d(fVar, aafoVar);
    }

    private final boolean g() {
        aubk aubkVar = this.c;
        return aubkVar != null && aubkVar.d.size() > 0;
    }

    private final boolean h() {
        aika aikaVar = this.a;
        return aikaVar != null && aikaVar.a(aika.ENDED);
    }

    private final boolean i() {
        MutedAutoplayState mutedAutoplayState = this.l;
        return (mutedAutoplayState == null || mutedAutoplayState.g == 4) ? false : true;
    }

    public final void a() {
        this.m.a(RelatedVideosScreen.a);
    }

    public final void b(MutedAutoplayState mutedAutoplayState) {
        this.l = mutedAutoplayState;
        e();
        d();
    }

    public final void c() {
        CharSequence charSequence;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar = this.m;
        aubk aubkVar = this.c;
        if (aubkVar == null || (aubkVar.c & 1) == 0) {
            charSequence = "";
        } else {
            arag aragVar4 = aubkVar.f;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            charSequence = ajgl.b(aragVar4);
        }
        this.h.a();
        ArrayList arrayList = new ArrayList();
        aubk aubkVar2 = this.c;
        if (aubkVar2 != null) {
            for (aubm aubmVar : aubkVar2.d) {
                if ((aubmVar.b & 1) != 0) {
                    aquw aquwVar = aubmVar.c;
                    if (aquwVar == null) {
                        aquwVar = aquw.a;
                    }
                    RelatedVideoItem relatedVideoItem = null;
                    aoob aoobVar = null;
                    if (aquwVar != null) {
                        c cVar = this.h;
                        avhn avhnVar = aquwVar.d;
                        if (avhnVar == null) {
                            avhnVar = avhn.a;
                        }
                        int i = c.a;
                        c.a = i + 1;
                        cVar.c.append(i, akel.q(avhnVar));
                        BitmapKey bitmapKey = new BitmapKey(cVar.b, i);
                        d dVar = this.i;
                        int i2 = d.a;
                        d.a = i2 + 1;
                        dVar.c.append(i2, aquwVar);
                        SelectableItemKey selectableItemKey = new SelectableItemKey(dVar.b, i2);
                        i i3 = RelatedVideoItem.i();
                        i3.a = aquwVar.c;
                        if ((aquwVar.b & 8) != 0) {
                            aragVar = aquwVar.f;
                            if (aragVar == null) {
                                aragVar = arag.a;
                            }
                        } else {
                            aragVar = null;
                        }
                        i3.b = ajgl.b(aragVar);
                        if ((aquwVar.b & 32) != 0) {
                            aragVar2 = aquwVar.h;
                            if (aragVar2 == null) {
                                aragVar2 = arag.a;
                            }
                        } else {
                            aragVar2 = null;
                        }
                        i3.c = ajgl.b(aragVar2);
                        if ((aquwVar.b & 512) != 0) {
                            aragVar3 = aquwVar.i;
                            if (aragVar3 == null) {
                                aragVar3 = arag.a;
                            }
                        } else {
                            aragVar3 = null;
                        }
                        i3.d = ajgl.b(aragVar3);
                        i3.e = bitmapKey;
                        i3.f = selectableItemKey;
                        if ((aquwVar.b & 16384) != 0) {
                            aoobVar = aquwVar.k;
                        }
                        i3.g = aoobVar;
                        relatedVideoItem = i3.a();
                    }
                    if (relatedVideoItem != null) {
                        arrayList.add(relatedVideoItem);
                    }
                }
            }
        }
        aVar.a(new RelatedVideosScreen(charSequence, arrayList));
    }

    public final void d() {
        if (!g() || i() || !h()) {
            return;
        }
        c();
    }

    public final void e() {
        aika aikaVar;
        ahia ahiaVar;
        boolean z = true;
        if (!g() || (aikaVar = this.a) == null || !aikaVar.a(aika.VIDEO_PLAYING, aika.ENDED) || i() || (((ahiaVar = this.b) == null || !ahiaVar.e()) && !h())) {
            z = false;
        }
        this.d.c(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ynl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] ky(java.lang.Class r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            r4 = -1
            r0 = 2
            r1 = 1
            r2 = 0
            if (r6 == r4) goto Lc3
            if (r6 == 0) goto L61
            if (r6 == r1) goto L3f
            if (r6 != r0) goto L26
            ahia r5 = (defpackage.ahia) r5
            ahia r4 = r3.b
            if (r4 == 0) goto L1a
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L1a
            goto Ld3
        L1a:
            r3.b = r5
            r3.a()
            r3.e()
            r3.d()
            return r2
        L26:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r0 = 32
            r5.<init>(r0)
            java.lang.String r0 = "unsupported op code: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3f:
            ahhw r5 = (defpackage.ahhw) r5
            aika r4 = r3.a
            if (r4 == 0) goto L51
            aika r6 = r5.c()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L51
            goto Ld3
        L51:
            aika r4 = r5.c()
            r3.a = r4
            r3.a()
            r3.e()
            r3.d()
            return r2
        L61:
            ahhm r5 = (defpackage.ahhm) r5
            com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r4 = r5.a()
            if (r4 != 0) goto L6b
        L69:
            r4 = r2
            goto La9
        L6b:
            asgt r4 = r4.a
            asgf r5 = r4.f
            if (r5 != 0) goto L73
            asgf r5 = defpackage.asgf.a
        L73:
            int r6 = r5.b
            r0 = 78882851(0x4b3a823, float:4.2237107E-36)
            if (r6 != r0) goto L7f
            java.lang.Object r5 = r5.c
            aube r5 = (defpackage.aube) r5
            goto L81
        L7f:
            aube r5 = defpackage.aube.a
        L81:
            aubb r5 = r5.g
            if (r5 != 0) goto L87
            aubb r5 = defpackage.aubb.a
        L87:
            int r5 = r5.b
            r5 = r5 & r1
            if (r5 == 0) goto L69
            asgf r4 = r4.f
            if (r4 != 0) goto L92
            asgf r4 = defpackage.asgf.a
        L92:
            int r5 = r4.b
            if (r5 != r0) goto L9b
            java.lang.Object r4 = r4.c
            aube r4 = (defpackage.aube) r4
            goto L9d
        L9b:
            aube r4 = defpackage.aube.a
        L9d:
            aubb r4 = r4.g
            if (r4 != 0) goto La3
            aubb r4 = defpackage.aubb.a
        La3:
            aubk r4 = r4.c
            if (r4 != 0) goto La9
            aubk r4 = defpackage.aubk.a
        La9:
            aubk r5 = r3.c
            boolean r5 = defpackage.akzj.f(r4, r5)
            if (r5 == 0) goto Lb2
            goto Ld3
        Lb2:
            r3.c = r4
            com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.c r4 = r3.h
            r4.a()
            r3.a()
            r3.e()
            r3.d()
            return r2
        Lc3:
            r4 = 3
            java.lang.Class[] r2 = new java.lang.Class[r4]
            r4 = 0
            java.lang.Class<ahhm> r5 = defpackage.ahhm.class
            r2[r4] = r5
            java.lang.Class<ahhw> r4 = defpackage.ahhw.class
            r2[r1] = r4
            java.lang.Class<ahia> r4 = defpackage.ahia.class
            r2[r0] = r4
        Ld3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.e.ky(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
