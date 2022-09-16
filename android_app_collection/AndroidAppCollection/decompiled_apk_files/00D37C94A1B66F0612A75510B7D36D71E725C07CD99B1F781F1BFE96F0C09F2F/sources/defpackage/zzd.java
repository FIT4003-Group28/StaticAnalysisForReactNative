package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zzd  reason: default package */
/* loaded from: classes4.dex */
public final class zzd implements aaan {
    private final ajmy a;
    private final /* synthetic */ int b;

    public zzd(ajmy ajmyVar, int i) {
        this.b = i;
        ajmyVar.getClass();
        this.a = ajmyVar;
    }

    private static CharSequence c(arjj arjjVar) {
        arjc arjcVar = arjjVar.d;
        if (arjcVar == null) {
            arjcVar = arjc.a;
        }
        arag aragVar = null;
        if ((arjcVar.b & 1) != 0) {
            arjc arjcVar2 = arjjVar.d;
            if (arjcVar2 == null) {
                arjcVar2 = arjc.a;
            }
            aplz aplzVar = arjcVar2.c;
            if (aplzVar == null) {
                aplzVar = aplz.a;
            }
            if ((aplzVar.b & 1) != 0) {
                arjc arjcVar3 = arjjVar.d;
                if (arjcVar3 == null) {
                    arjcVar3 = arjc.a;
                }
                aplz aplzVar2 = arjcVar3.c;
                if (aplzVar2 == null) {
                    aplzVar2 = aplz.a;
                }
                aragVar = aplzVar2.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            }
            return ajgl.b(aragVar);
        }
        return null;
    }

    public zzd(ajmy ajmyVar) {
        ajmyVar.getClass();
        this.a = ajmyVar;
    }

    public zzd(ajmy ajmyVar, int i, byte[] bArr) {
        this.b = i;
        ajmyVar.getClass();
        this.a = ajmyVar;
    }

    @Override // defpackage.aaan
    public final yo a(Context context, ViewGroup viewGroup, zyz zyzVar, boolean z) {
        int i = this.b;
        if (i == 0) {
            return new zzc(LayoutInflater.from(context).inflate(true != z ? R.layout.info_card_playlist_watch_next : R.layout.info_card_playlist, viewGroup, false));
        } else if (i == 1) {
            return new zyy(LayoutInflater.from(context).inflate(true != z ? R.layout.info_card_collaborator_watch_next : R.layout.info_card_collaborator, viewGroup, false));
        } else {
            return new zzm(LayoutInflater.from(context).inflate(true != z ? R.layout.info_card_video_watch_next : R.layout.info_card_video, viewGroup, false));
        }
    }

    @Override // defpackage.aaan
    public final void b(Context context, zza zzaVar, yo yoVar, aaar aaarVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        arag aragVar6;
        arag aragVar7;
        int i = this.b;
        if (i == 0) {
            zzc zzcVar = (zzc) yoVar;
            arjd b = zzaVar.b();
            ajmy ajmyVar = this.a;
            ImageView imageView = zzcVar.t.a;
            avhn avhnVar = b.b;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            TextView textView = zzcVar.u;
            arag aragVar8 = b.d;
            if (aragVar8 == null) {
                aragVar8 = arag.a;
            }
            zag.m(textView, ajgl.b(aragVar8));
            zzcVar.v.setVisibility(zzcVar.u.getVisibility());
            TextView textView2 = zzcVar.w;
            arag aragVar9 = b.e;
            if (aragVar9 == null) {
                aragVar9 = arag.a;
            }
            zag.m(textView2, ajgl.b(aragVar9));
            TextView textView3 = zzcVar.x;
            arag aragVar10 = b.f;
            if (aragVar10 == null) {
                aragVar10 = arag.a;
            }
            zag.m(textView3, ajgl.b(aragVar10));
            arag aragVar11 = b.g;
            if (aragVar11 == null) {
                aragVar11 = arag.a;
            }
            Spanned b2 = ajgl.b(aragVar11);
            zag.m(zzcVar.y, b2);
            YouTubeTextView youTubeTextView = zzcVar.t.b;
            arag aragVar12 = b.c;
            if (aragVar12 == null) {
                aragVar12 = arag.a;
            }
            zag.m(youTubeTextView, ajgl.b(aragVar12));
            zzcVar.t.setContentDescription(" ");
            TextView textView4 = zzcVar.y;
            String valueOf = String.valueOf(b2);
            String string = context.getString(R.string.accessibility_playlist_card);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(string);
            textView4.setContentDescription(sb.toString());
            zzcVar.a.setOnClickListener(new zzb(aaarVar, b));
            return;
        }
        arag aragVar13 = null;
        if (i == 1) {
            zyy zyyVar = (zyy) yoVar;
            arip a = zzaVar.a();
            ajmy ajmyVar2 = this.a;
            ImageView imageView2 = zyyVar.t;
            avhn avhnVar2 = a.c;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            ajmyVar2.h(imageView2, avhnVar2);
            TextView textView5 = zyyVar.u;
            if ((a.b & 8) != 0) {
                aragVar = a.f;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(textView5, ajgl.b(aragVar));
            TextView textView6 = zyyVar.v;
            if ((a.b & 4) != 0) {
                aragVar2 = a.e;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            zag.m(textView6, ajgl.b(aragVar2));
            TextView textView7 = zyyVar.w;
            if ((a.b & 2) != 0 && (aragVar13 = a.d) == null) {
                aragVar13 = arag.a;
            }
            zag.m(textView7, ajgl.b(aragVar13));
            zyyVar.a.setOnClickListener(new zyx(aaarVar, a));
            return;
        }
        zzm zzmVar = (zzm) yoVar;
        arjj f = zzaVar.f();
        ajmy ajmyVar3 = this.a;
        ImageView imageView3 = zzmVar.t;
        avhn avhnVar3 = f.c;
        if (avhnVar3 == null) {
            avhnVar3 = avhn.a;
        }
        ajmyVar3.h(imageView3, avhnVar3);
        TextView textView8 = zzmVar.u;
        if ((f.b & 8) != 0) {
            aragVar3 = f.f;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(textView8, ajgl.b(aragVar3));
        zzmVar.v.setVisibility(zzmVar.u.getVisibility());
        TextView textView9 = zzmVar.w;
        if ((f.b & 4) != 0) {
            aragVar4 = f.e;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        zag.m(textView9, ajgl.b(aragVar4));
        zag.m(zzmVar.x, c(f));
        TextView textView10 = zzmVar.y;
        if ((f.b & 16) != 0) {
            aragVar5 = f.g;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
        } else {
            aragVar5 = null;
        }
        zag.m(textView10, ajgl.b(aragVar5));
        TextView textView11 = zzmVar.z;
        if ((f.b & 32) != 0) {
            aragVar6 = f.h;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
        } else {
            aragVar6 = null;
        }
        zag.m(textView11, ajgl.b(aragVar6));
        if ((f.b & 64) != 0) {
            aragVar7 = f.i;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
        } else {
            aragVar7 = null;
        }
        Spanned b3 = ajgl.b(aragVar7);
        zag.m(zzmVar.A, b3);
        zzmVar.w.setContentDescription(" ");
        zzmVar.x.setContentDescription(" ");
        TextView textView12 = zzmVar.A;
        String valueOf2 = String.valueOf(zgh.d(b3));
        if ((f.b & 4) != 0 && (aragVar13 = f.e) == null) {
            aragVar13 = arag.a;
        }
        String valueOf3 = String.valueOf(zgh.d(ajgl.i(aragVar13)));
        String valueOf4 = String.valueOf(zgh.d(c(f)));
        String string2 = context.getString(R.string.accessibility_video_card);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 4 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(string2).length());
        sb2.append(valueOf2);
        sb2.append("; ");
        sb2.append(valueOf3);
        sb2.append(" ");
        sb2.append(valueOf4);
        sb2.append(" ");
        sb2.append(string2);
        textView12.setContentDescription(sb2.toString());
        zzmVar.a.setOnClickListener(new zzl(aaarVar, f));
    }
}
