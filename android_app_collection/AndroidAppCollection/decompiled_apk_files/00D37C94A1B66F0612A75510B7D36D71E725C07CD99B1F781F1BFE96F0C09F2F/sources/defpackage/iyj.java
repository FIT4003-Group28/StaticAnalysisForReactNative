package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: iyj  reason: default package */
/* loaded from: classes3.dex */
public final class iyj extends iyq implements ynl {
    public final azqb a;
    private View v;

    public iyj(Context context, azqb azqbVar, izu izuVar, azqb azqbVar2, jaa jaaVar, iyo iyoVar, ajyc ajycVar, oeq oeqVar, acwu acwuVar, airw airwVar, azqb azqbVar3) {
        super(context, azqbVar, izuVar, oeqVar, azqbVar2, ajycVar, jaaVar, iyoVar, acwuVar, airwVar);
        this.a = azqbVar3;
    }

    private final String c() {
        adwj adwjVar = this.t;
        int i = adwjVar.e;
        int i2 = adwjVar.d;
        if (i >= i2 || i2 == 0) {
            return this.b.getString(R.string.mdx_remote_queue_header_description);
        }
        return this.b.getString(R.string.mdx_remote_queue_header_description_nonempty, String.valueOf(i + 1), String.valueOf(this.t.d));
    }

    @Override // defpackage.adwm
    public final void h(int i, adwj adwjVar) {
        Optional empty;
        this.t = adwjVar;
        if (this.o && i == 5 && this.o) {
            adlj adljVar = adlj.PLAYING_VIDEO;
            aijx aijxVar = aijx.NEW;
            int ordinal = this.t.h.ordinal();
            if (ordinal == 0) {
                this.q.setVisibility(8);
                if (this.i) {
                    this.l.setVisibility(0);
                }
                this.p.setVisibility(0);
                this.n.setVisibility(8);
            } else if (ordinal == 4) {
                Optional ofNullable = Optional.ofNullable(this.t.g);
                if (this.o && ofNullable.isPresent()) {
                    audg audgVar = ((WatchNextResponseModel) ofNullable.get()).g;
                    if (audgVar == null) {
                        this.e.a();
                    } else {
                        this.q.setVisibility(8);
                        if (this.i) {
                            this.l.setVisibility(0);
                        }
                        this.p.setVisibility(0);
                        this.n.setVisibility(0);
                        this.e.e(audgVar);
                        izz izzVar = this.r;
                        audg audgVar2 = ((WatchNextResponseModel) ofNullable.get()).g;
                        izzVar.f = audgVar2 != null && adwa.a(audgVar2.k);
                        izzVar.a();
                        int i2 = audgVar.c;
                        atep atepVar = null;
                        this.m.setText(((i2 & 128) == 0 && (8 & i2) == 0) ? null : this.b.getString(R.string.mdx_remote_queue_video_count, String.valueOf(audgVar.j + 1), String.valueOf(audgVar.m)));
                        ajyc ajycVar = this.g;
                        ImageView imageView = this.n;
                        ates atesVar = audgVar.z;
                        if (atesVar == null) {
                            atesVar = ates.a;
                        }
                        if ((atesVar.b & 1) != 0) {
                            ates atesVar2 = audgVar.z;
                            if (atesVar2 == null) {
                                atesVar2 = ates.a;
                            }
                            atepVar = atesVar2.c;
                            if (atepVar == null) {
                                atepVar = atep.a;
                            }
                        }
                        ajycVar.d(imageView, atepVar, audgVar, acti.l);
                    }
                }
                if (!ofNullable.isPresent()) {
                    return;
                }
                this.g.g(this.n);
                View view = this.v;
                if (view != null) {
                    view.setContentDescription(c());
                }
                audg audgVar3 = ((WatchNextResponseModel) ofNullable.get()).g;
                if (audgVar3 != null && (audgVar3.c & 4194304) != 0) {
                    ates atesVar3 = audgVar3.z;
                    if (atesVar3 == null) {
                        atesVar3 = ates.a;
                    }
                    if ((atesVar3.b & 1) != 0) {
                        ates atesVar4 = audgVar3.z;
                        if (atesVar4 == null) {
                            atesVar4 = ates.a;
                        }
                        atep atepVar2 = atesVar4.c;
                        if (atepVar2 == null) {
                            atepVar2 = atep.a;
                        }
                        for (aten atenVar : atepVar2.c) {
                            ateo ateoVar = atenVar.c;
                            if (ateoVar == null) {
                                ateoVar = ateo.a;
                            }
                            if ((ateoVar.b & 4) != 0) {
                                ateo ateoVar2 = atenVar.c;
                                if (ateoVar2 == null) {
                                    ateoVar2 = ateo.a;
                                }
                                apzg apzgVar = ateoVar2.e;
                                if (apzgVar == null) {
                                    apzgVar = apzg.a;
                                }
                                if (!apzgVar.qn(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint)) {
                                    ateo ateoVar3 = atenVar.c;
                                    if (ateoVar3 == null) {
                                        ateoVar3 = ateo.a;
                                    }
                                    apzg apzgVar2 = ateoVar3.e;
                                    if (apzgVar2 == null) {
                                        apzgVar2 = apzg.a;
                                    }
                                    if (apzgVar2.qn(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint)) {
                                    }
                                }
                                ateo ateoVar4 = atenVar.c;
                                if (ateoVar4 == null) {
                                    ateoVar4 = ateo.a;
                                }
                                apzg apzgVar3 = ateoVar4.e;
                                if (apzgVar3 == null) {
                                    apzgVar3 = apzg.a;
                                }
                                empty = Optional.of(apzgVar3);
                                aopc aopcVar = (aopc) apzg.a.createBuilder();
                                aopcVar.e(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a);
                                final apzg apzgVar4 = (apzg) empty.orElse((apzg) aopcVar.mo39build());
                                this.n.setOnClickListener(new View.OnClickListener() { // from class: iyi
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        iyj iyjVar = iyj.this;
                                        ((aafo) iyjVar.a.get()).a(apzgVar4);
                                    }
                                });
                            }
                        }
                        empty = Optional.empty();
                        aopc aopcVar2 = (aopc) apzg.a.createBuilder();
                        aopcVar2.e(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a);
                        final apzg apzgVar42 = (apzg) empty.orElse((apzg) aopcVar2.mo39build());
                        this.n.setOnClickListener(new View.OnClickListener() { // from class: iyi
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                iyj iyjVar = iyj.this;
                                ((aafo) iyjVar.a.get()).a(apzgVar42);
                            }
                        });
                    }
                }
                empty = Optional.empty();
                aopc aopcVar22 = (aopc) apzg.a.createBuilder();
                aopcVar22.e(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a);
                final apzg apzgVar422 = (apzg) empty.orElse((apzg) aopcVar22.mo39build());
                this.n.setOnClickListener(new View.OnClickListener() { // from class: iyi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        iyj iyjVar = iyj.this;
                        ((aafo) iyjVar.a.get()).a(apzgVar422);
                    }
                });
            }
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                adlj adljVar = adlj.PLAYING_VIDEO;
                aijx aijxVar = aijx.NEW;
                if (((adlj) obj).ordinal() != 2) {
                    return null;
                }
                b();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{adlj.class};
    }

    @Override // defpackage.iyq
    public final void a(ViewGroup viewGroup) {
        if (!this.o) {
            if (!this.o) {
                adwt adwtVar = (adwt) this.c.get();
                this.t = adwtVar.i;
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.mdx_playlist_mode);
                viewGroup2.getClass();
                this.l = viewGroup2;
                RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.mdx_remote_queue_list);
                recyclerView.getClass();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.ab(1);
                recyclerView.ag(linearLayoutManager);
                recyclerView.setNestedScrollingEnabled(true);
                LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewGroup.findViewById(R.id.mdx_remote_queue_loading_layout);
                loadingFrameLayout.getClass();
                this.p = loadingFrameLayout;
                TextView textView = (TextView) viewGroup.findViewById(R.id.mdx_remote_queue_header_video_count);
                textView.getClass();
                this.m = textView;
                ImageView imageView = (ImageView) viewGroup.findViewById(R.id.mdx_remote_queue_header_contextual_menu_anchor);
                imageView.getClass();
                this.n = imageView;
                View findViewById = viewGroup.findViewById(R.id.empty_queue);
                findViewById.getClass();
                this.q = findViewById;
                this.e.f(recyclerView);
                this.e.d(this.p);
                izu izuVar = this.d;
                boolean a = izuVar.a();
                izuVar.a = viewGroup;
                if (izuVar.a() != a) {
                    izuVar.c();
                }
                adwtVar.a(this);
                if (this.f.get() != null) {
                    this.u.g(((iyp) this.f.get()).g(this.k));
                }
                jaa jaaVar = this.h;
                oeq oeqVar = this.e;
                adoa adoaVar = (adoa) jaaVar.a.get();
                adoaVar.getClass();
                oeqVar.getClass();
                adwt adwtVar2 = (adwt) jaaVar.b.get();
                adwtVar2.getClass();
                this.r = new izz(adoaVar, recyclerView, oeqVar, adwtVar2);
                izz izzVar = this.r;
                izzVar.e = izzVar.c.e();
                if (((ync) izzVar.b.b).size() == 0) {
                    izzVar.b.c(izzVar.h);
                }
                izzVar.d.a(izzVar.i);
                izzVar.g = izzVar.d.i;
                izzVar.b();
                if (this.i) {
                    iyo iyoVar = this.j;
                    ViewGroup viewGroup3 = this.l;
                    adoa adoaVar2 = (adoa) iyoVar.a.get();
                    adoaVar2.getClass();
                    viewGroup3.getClass();
                    this.s = new iyn(adoaVar2, viewGroup3);
                    iyn iynVar = this.s;
                    iynVar.a.g(iynVar);
                    adnt e = iynVar.a.e();
                    if (e != null) {
                        iynVar.l(e);
                    }
                }
                this.o = true;
            }
            View findViewById2 = viewGroup.findViewById(R.id.mdx_next_gen_fiji_remote_queue_header);
            this.v = findViewById2;
            findViewById2.setContentDescription(c());
            Drawable a2 = akf.a(this.b, 2131233404);
            if (a2 != null) {
                a2.mutate();
                a2.setColorFilter(zhn.d(this.b, R.attr.ytTextPrimary), PorterDuff.Mode.SRC_ATOP);
                this.n.setImageDrawable(a2);
            }
            b();
        }
    }
}
