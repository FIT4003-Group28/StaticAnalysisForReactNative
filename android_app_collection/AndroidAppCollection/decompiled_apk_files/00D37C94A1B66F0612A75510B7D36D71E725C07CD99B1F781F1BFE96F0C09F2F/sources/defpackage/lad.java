package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lad  reason: default package */
/* loaded from: classes3.dex */
public final class lad extends ajsl {
    public final aafo a;
    private final ajmy b;
    private final ajrx c;
    private final Resources d;
    private final LayoutInflater e;
    private final View f;
    private LinearLayout g;
    private awdm h;
    private boolean i;
    private int j;

    public lad(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar) {
        ajmyVar.getClass();
        this.b = ajmyVar;
        this.c = gemVar;
        aafoVar.getClass();
        this.a = aafoVar;
        this.d = context.getResources();
        LayoutInflater from = LayoutInflater.from(context);
        this.e = from;
        View inflate = from.inflate(R.layout.watch_card_list, (ViewGroup) null);
        this.f = inflate;
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.c).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        apzg apzgVar2;
        arag aragVar4;
        arag aragVar5;
        arag aragVar6;
        arag aragVar7;
        apzg apzgVar3;
        arag aragVar8;
        arag aragVar9;
        awdm awdmVar = (awdm) obj;
        if (!awdmVar.equals(this.h)) {
            this.i = false;
        }
        if (!this.i || this.d.getConfiguration().orientation != this.j) {
            this.h = awdmVar;
            if (!this.i) {
                this.g = (LinearLayout) this.f.findViewById(R.id.watch_card_items);
                TextView textView = (TextView) this.f.findViewById(R.id.card_title);
                if ((awdmVar.b & 1) != 0) {
                    aragVar7 = awdmVar.c;
                    if (aragVar7 == null) {
                        aragVar7 = arag.a;
                    }
                } else {
                    aragVar7 = null;
                }
                textView.setText(ajgl.b(aragVar7));
                if ((awdmVar.b & 2) != 0) {
                    apzgVar3 = awdmVar.d;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                } else {
                    apzgVar3 = null;
                }
                textView.setOnClickListener(new lac(this, apzgVar3, 3));
                TextView textView2 = (TextView) this.f.findViewById(R.id.related_entities_title);
                LinearLayout linearLayout = (LinearLayout) this.f.findViewById(R.id.related_entities);
                ViewGroup viewGroup = (ViewGroup) linearLayout.getParent();
                awdq awdqVar = awdmVar.f;
                if (awdqVar == null) {
                    awdqVar = awdq.a;
                }
                aopu aopuVar = awdqVar.d;
                if (aopuVar.isEmpty()) {
                    viewGroup.setVisibility(8);
                    textView2.setVisibility(8);
                } else {
                    awdq awdqVar2 = awdmVar.f;
                    if (awdqVar2 == null) {
                        awdqVar2 = awdq.a;
                    }
                    if ((awdqVar2.b & 1) != 0) {
                        awdq awdqVar3 = awdmVar.f;
                        if (awdqVar3 == null) {
                            awdqVar3 = awdq.a;
                        }
                        aragVar8 = awdqVar3.c;
                        if (aragVar8 == null) {
                            aragVar8 = arag.a;
                        }
                    } else {
                        aragVar8 = null;
                    }
                    textView2.setText(ajgl.b(aragVar8));
                    viewGroup.setVisibility(0);
                    linearLayout.removeAllViews();
                    int i = 0;
                    while (i < aopuVar.size()) {
                        awdr awdrVar = (awdr) aopuVar.get(i);
                        View inflate = this.e.inflate(R.layout.watch_card_related_entity_fixed_width, (ViewGroup) linearLayout, false);
                        TextView textView3 = (TextView) inflate.findViewById(R.id.title);
                        if ((awdrVar.b & 1) != 0) {
                            aragVar9 = awdrVar.c;
                            if (aragVar9 == null) {
                                aragVar9 = arag.a;
                            }
                        } else {
                            aragVar9 = null;
                        }
                        textView3.setText(ajgl.b(aragVar9));
                        ajmy ajmyVar = this.b;
                        ImageView imageView = (ImageView) inflate.findViewById(R.id.thumbnail);
                        avhn avhnVar = awdrVar.d;
                        if (avhnVar == null) {
                            avhnVar = avhn.a;
                        }
                        ajmyVar.h(imageView, avhnVar);
                        apzg apzgVar4 = awdrVar.e;
                        if (apzgVar4 == null) {
                            apzgVar4 = apzg.a;
                        }
                        inflate.setOnClickListener(new lac(this, apzgVar4, 2));
                        if (i == 0) {
                            inflate.setPadding(inflate.getPaddingRight(), inflate.getPaddingTop(), inflate.getPaddingRight(), inflate.getPaddingBottom());
                            i = 0;
                        }
                        linearLayout.addView(inflate);
                        i++;
                    }
                }
            }
            this.g.removeAllViews();
            for (awdl awdlVar : awdmVar.e) {
                int i2 = awdlVar.b;
                if (i2 == 63271829) {
                    LinearLayout linearLayout2 = this.g;
                    awdp awdpVar = (awdp) awdlVar.c;
                    View inflate2 = this.e.inflate(R.layout.watch_card_radio, (ViewGroup) linearLayout2, false);
                    if ((awdpVar.b & 32) != 0) {
                        apzgVar = awdpVar.g;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    } else {
                        apzgVar = null;
                    }
                    inflate2.setOnClickListener(new lac(this, apzgVar));
                    View findViewById = inflate2.findViewById(R.id.radio_item);
                    PlaylistThumbnailView playlistThumbnailView = (PlaylistThumbnailView) findViewById.findViewById(R.id.playlist_thumbnail);
                    avhn avhnVar2 = awdpVar.c;
                    if (avhnVar2 == null) {
                        avhnVar2 = avhn.a;
                    }
                    playlistThumbnailView.d(akel.B(avhnVar2));
                    this.b.h(playlistThumbnailView.b, avhnVar2);
                    TextView textView4 = (TextView) findViewById.findViewById(R.id.title);
                    if ((awdpVar.b & 4) != 0) {
                        aragVar = awdpVar.d;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    textView4.setText(ajgl.b(aragVar));
                    TextView textView5 = (TextView) findViewById.findViewById(R.id.owner);
                    if ((awdpVar.b & 16) != 0) {
                        aragVar2 = awdpVar.f;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    textView5.setText(ajgl.b(aragVar2));
                    YouTubeTextView youTubeTextView = playlistThumbnailView.c;
                    if ((awdpVar.b & 8) != 0) {
                        aragVar3 = awdpVar.e;
                        if (aragVar3 == null) {
                            aragVar3 = arag.a;
                        }
                    } else {
                        aragVar3 = null;
                    }
                    youTubeTextView.setText(ajgl.b(aragVar3));
                    linearLayout2.addView(inflate2);
                } else if (i2 == 63336837) {
                    LinearLayout linearLayout3 = this.g;
                    awdo awdoVar = (awdo) awdlVar.c;
                    View inflate3 = this.e.inflate(R.layout.watch_card_playlist, (ViewGroup) null);
                    if ((awdoVar.b & 32) != 0) {
                        apzgVar2 = awdoVar.g;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                    } else {
                        apzgVar2 = null;
                    }
                    inflate3.setOnClickListener(new lac(this, apzgVar2, 1));
                    View findViewById2 = inflate3.findViewById(R.id.playlist_item);
                    TextView textView6 = (TextView) findViewById2.findViewById(R.id.title);
                    if ((awdoVar.b & 4) != 0) {
                        aragVar4 = awdoVar.d;
                        if (aragVar4 == null) {
                            aragVar4 = arag.a;
                        }
                    } else {
                        aragVar4 = null;
                    }
                    textView6.setText(ajgl.b(aragVar4));
                    TextView textView7 = (TextView) findViewById2.findViewById(R.id.owner);
                    if ((awdoVar.b & 16) != 0) {
                        aragVar5 = awdoVar.f;
                        if (aragVar5 == null) {
                            aragVar5 = arag.a;
                        }
                    } else {
                        aragVar5 = null;
                    }
                    zag.m(textView7, ajgl.b(aragVar5));
                    PlaylistThumbnailView playlistThumbnailView2 = (PlaylistThumbnailView) findViewById2.findViewById(R.id.playlist_thumbnail);
                    YouTubeTextView youTubeTextView2 = playlistThumbnailView2.c;
                    if ((awdoVar.b & 8) != 0) {
                        aragVar6 = awdoVar.e;
                        if (aragVar6 == null) {
                            aragVar6 = arag.a;
                        }
                    } else {
                        aragVar6 = null;
                    }
                    zag.m(youTubeTextView2, ajgl.b(aragVar6));
                    ajmy ajmyVar2 = this.b;
                    ImageView imageView2 = playlistThumbnailView2.b;
                    avhn avhnVar3 = awdoVar.c;
                    if (avhnVar3 == null) {
                        avhnVar3 = avhn.a;
                    }
                    ajmyVar2.h(imageView2, avhnVar3);
                    linearLayout3.addView(inflate3);
                }
            }
            this.i = true;
            this.j = this.d.getConfiguration().orientation;
            this.c.e(ajrsVar);
            return;
        }
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        awdm awdmVar = (awdm) obj;
        if ((awdmVar.b & 128) != 0) {
            return awdmVar.g.I();
        }
        return null;
    }

    @Override // defpackage.ajsl
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
