package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ae implements View.OnClickListener {
    final /* synthetic */ al a;

    public ae(al alVar) {
        this.a = alVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        al alVar = this.a;
        if (view == alVar.q) {
            if (!alVar.L || !alVar.f156J.u) {
                return;
            }
            if (alVar.S()) {
                alVar.G();
                alVar.P(true);
            }
            alVar.b.a();
        } else if (view == alVar.r) {
            if (!alVar.M || !alVar.f156J.u) {
                return;
            }
            if (alVar.S()) {
                alVar.G();
                alVar.P(true);
            }
            alVar.b.b();
        } else if (view == alVar.p) {
            if (alVar.I.a == ahzb.ENDED) {
                this.a.b.n();
            } else if (this.a.I.a == ahzb.PLAYING) {
                this.a.b.e();
            } else if (this.a.I.a == ahzb.PAUSED) {
                this.a.b.f();
            }
        } else if (view == alVar.y) {
            alVar.b.l();
        } else if (view == alVar.z) {
            alVar.b.m();
        } else if (view == alVar.m) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar = alVar.d;
            if (aVar == null) {
                return;
            }
            aVar.j();
            al alVar2 = this.a;
            alVar2.D.a(alVar2.m.a.I());
        } else if (view == alVar.n) {
            if (!alVar.Q) {
                return;
            }
            alVar.e.s();
        } else if (view == alVar.o) {
            com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar = alVar.C;
            if (dVar != null) {
                try {
                    dVar.b(actj.PLAYER_OVERFLOW_BUTTON.II);
                } catch (RemoteException unused) {
                }
            }
            final com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b bVar = alVar.E;
            final ArrayList<com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a> arrayList = new ArrayList();
            if (bVar.f()) {
                if (bVar.j == null) {
                    bVar.a();
                }
                arrayList.add(bVar.j);
            }
            if (bVar.n) {
                if (bVar.i == null) {
                    Drawable drawable = bVar.g.getResources().getDrawable(R.drawable.embeds_closed_caption_icon, bVar.g.getTheme());
                    com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar2 = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a(bVar.g.getResources().getString(R.string.overflow_captions), 1);
                    aVar2.d = drawable;
                    aVar2.f = bVar.g.getText(R.string.accessibility_closed_captions);
                    aVar2.g = actj.PLAYER_OVERFLOW_MENU_CC_BUTTON;
                    bVar.i = aVar2;
                }
                arrayList.add(bVar.i);
            }
            if (bVar.o) {
                if (bVar.k == null) {
                    Drawable drawable2 = bVar.g.getResources().getDrawable(2131232825);
                    String d = bVar.q.d();
                    String c = bVar.q.c();
                    if (bVar.o && d != null && c != null) {
                        com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar3 = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a(d, 2);
                        aVar3.d = drawable2;
                        aVar3.f = c;
                        aVar3.h = bVar.q.b();
                        bVar.k = aVar3;
                    }
                }
                com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar4 = bVar.k;
                if (aVar4 != null) {
                    arrayList.add(aVar4);
                }
            }
            if (bVar.r) {
                if (bVar.l == null) {
                    Resources resources = bVar.g.getResources();
                    Drawable drawable3 = resources.getDrawable(2131232532);
                    com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar5 = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a(resources.getString(R.string.share), 3);
                    aVar5.d = drawable3;
                    aVar5.f = bVar.g.getText(R.string.accessibility_share);
                    bVar.l = aVar5;
                }
                com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar6 = bVar.l;
                if (aVar6 != null) {
                    arrayList.add(aVar6);
                }
            }
            AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.a
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                    VideoQuality[] videoQualityArr;
                    String string;
                    b bVar2 = b.this;
                    int i2 = ((com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a) arrayList.get(i)).a;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            bVar2.b(actj.PLAYER_OVERFLOW_MENU_CC_BUTTON);
                            bVar2.e.c();
                            return;
                        } else if (i2 == 2) {
                            bVar2.f.cancel();
                            bVar2.p.j();
                            try {
                                bVar2.h.c(bVar2.q.b().I());
                                return;
                            } catch (RemoteException e) {
                                pcu.h(e);
                                return;
                            }
                        } else {
                            if (i2 == 3) {
                                bVar2.f.cancel();
                                bVar2.s.s();
                                return;
                            }
                            throw new IllegalArgumentException("Top level list item must have either quality or captions id");
                        }
                    }
                    bVar2.b(actj.PLAYER_OVERFLOW_MENU_QUALITY_BUTTON);
                    final d dVar2 = bVar2.c;
                    com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.e eVar = bVar2.f;
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    for (VideoQuality videoQuality : dVar2.f) {
                        com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.b bVar3 = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.b(videoQuality.b);
                        if (!dVar2.i) {
                            if (i3 == dVar2.g) {
                                bVar3.b();
                            }
                        } else if (videoQuality.a == -2) {
                            int i4 = dVar2.g;
                            if (i4 > 0 && i4 < dVar2.f.length) {
                                string = dVar2.c.getResources().getString(R.string.quality_label, dVar2.f[dVar2.g].b);
                            } else {
                                int i5 = dVar2.h;
                                string = (i5 <= 0 || i5 >= dVar2.f.length) ? "" : dVar2.c.getResources().getString(R.string.quality_label, dVar2.f[dVar2.h].b);
                            }
                            String valueOf = String.valueOf(string);
                            bVar3.e = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
                            bVar3.c = true;
                            bVar3.b();
                        }
                        arrayList2.add(bVar3);
                        i3++;
                    }
                    dVar2.d = pce.j(R.string.quality_title, arrayList2, new AdapterView.OnItemClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.c
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView2, View view3, int i6, long j2) {
                            d dVar3 = d.this;
                            if (i6 >= 0) {
                                VideoQuality[] videoQualityArr2 = dVar3.f;
                                if (i6 >= videoQualityArr2.length) {
                                    return;
                                }
                                dVar3.e.w(videoQualityArr2[i6].a);
                                dVar3.d.cancel();
                            }
                        }
                    }, dVar2.c, dVar2.a, dVar2.b);
                    eVar.b(dVar2.d);
                }
            };
            pce pceVar = bVar.t;
            bVar.f = pce.j(0, arrayList, onItemClickListener, bVar.g, bVar.a, bVar.b);
            bVar.f.show();
            if (bVar.r && bVar.l != null) {
                bVar.s.t();
            }
            for (com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar7 : arrayList) {
                actj actjVar = aVar7.g;
                if (actjVar != null) {
                    try {
                        bVar.h.h(actjVar.II);
                    } catch (RemoteException e) {
                        pcu.h(e);
                    }
                } else {
                    aoob aoobVar = aVar7.h;
                    if (aoobVar != null) {
                        try {
                            bVar.h.i(aoobVar.I());
                        } catch (RemoteException e2) {
                            pcu.h(e2);
                        }
                    }
                }
            }
        } else {
            TouchImageView touchImageView = alVar.j;
            if (view == touchImageView) {
                alVar.b.v(!touchImageView.isSelected());
            } else if (view == alVar.k) {
                if (alVar.K) {
                    return;
                }
                alVar.G();
                this.a.P(true);
            } else if (view == alVar.l) {
                long j = alVar.i.a;
                alVar.b.r(j);
                aibs.K(this.a.i, j);
                this.a.h.P(j);
                this.a.R(true);
            }
        }
    }
}
