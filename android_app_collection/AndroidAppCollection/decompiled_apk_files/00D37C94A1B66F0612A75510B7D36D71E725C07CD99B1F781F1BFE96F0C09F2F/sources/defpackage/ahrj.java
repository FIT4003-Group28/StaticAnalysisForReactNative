package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ahrj  reason: default package */
/* loaded from: classes.dex */
public final class ahrj extends ahjs implements ahlz, ahoa {
    public final Context e;
    public final ahoo f;
    public final ViewGroup g;
    public final ahrh h;
    public ahlp i;
    public boolean j;
    private final ahob k;
    private final Handler m;

    public ahrj(Context context, ahob ahobVar, ahoo ahooVar, ajmy ajmyVar, ViewGroup viewGroup, aafo aafoVar) {
        super(new ahli(ahooVar, 0.0f, 0.0f));
        this.e = context;
        ahobVar.getClass();
        this.k = ahobVar;
        this.f = ahooVar;
        this.g = viewGroup;
        this.m = new Handler(Looper.getMainLooper());
        this.h = new ahrh(context, ajmyVar, viewGroup, aafoVar);
        d();
    }

    private final void d() {
        if (!v()) {
            this.l = true;
        }
    }

    public final void a() {
        if (v()) {
            this.l = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(final aubm[] aubmVarArr) {
        this.m.post(new Runnable() { // from class: ahri
            @Override // java.lang.Runnable
            public final void run() {
                arag aragVar;
                arag aragVar2;
                ahrj ahrjVar = ahrj.this;
                aubm[] aubmVarArr2 = aubmVarArr;
                ArrayList<View> arrayList = new ArrayList(aubmVarArr2.length);
                for (aubm aubmVar : aubmVarArr2) {
                    ahrh ahrhVar = ahrjVar.h;
                    View view = null;
                    view = null;
                    arag aragVar3 = null;
                    if (aubmVar == null) {
                        zep.b("Cannot create view because the renderer was null");
                    } else {
                        int i = aubmVar.b;
                        if ((i & 1) != 0) {
                            aquw aquwVar = aubmVar.c;
                            if (aquwVar == null) {
                                aquwVar = aquw.a;
                            }
                            View b = ahrhVar.b(R.layout.vr_watch_next_video);
                            avhn avhnVar = aquwVar.d;
                            if (avhnVar == null) {
                                avhnVar = avhn.a;
                            }
                            avhn avhnVar2 = avhnVar;
                            arag aragVar4 = aquwVar.f;
                            if (aragVar4 == null) {
                                aragVar4 = arag.a;
                            }
                            arag aragVar5 = aragVar4;
                            if ((aquwVar.b & 32) != 0) {
                                aragVar2 = aquwVar.h;
                                if (aragVar2 == null) {
                                    aragVar2 = arag.a;
                                }
                            } else {
                                aragVar2 = aquwVar.g;
                                if (aragVar2 == null) {
                                    aragVar2 = arag.a;
                                }
                            }
                            arag aragVar6 = aragVar2;
                            apzg apzgVar = aquwVar.j;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            ahrhVar.c(b, avhnVar2, aragVar5, aragVar6, apzgVar);
                            TextView textView = (TextView) b.findViewById(R.id.duration);
                            if ((aquwVar.b & 512) != 0 && (aragVar3 = aquwVar.i) == null) {
                                aragVar3 = arag.a;
                            }
                            textView.setText(ajgl.b(aragVar3));
                            view = b;
                        } else if ((i & 2) != 0) {
                            aquv aquvVar = aubmVar.d;
                            if (aquvVar == null) {
                                aquvVar = aquv.a;
                            }
                            view = ahrhVar.b(R.layout.vr_watch_next_playlist);
                            avhn avhnVar3 = aquvVar.d;
                            if (avhnVar3 == null) {
                                avhnVar3 = avhn.a;
                            }
                            avhn avhnVar4 = avhnVar3;
                            arag aragVar7 = aquvVar.c;
                            if (aragVar7 == null) {
                                aragVar7 = arag.a;
                            }
                            arag aragVar8 = aragVar7;
                            if ((aquvVar.b & 64) != 0) {
                                aragVar = aquvVar.f;
                                if (aragVar == null) {
                                    aragVar = arag.a;
                                }
                            } else {
                                aragVar = aquvVar.g;
                                if (aragVar == null) {
                                    aragVar = arag.a;
                                }
                            }
                            arag aragVar9 = aragVar;
                            apzg apzgVar2 = aquvVar.e;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            ahrhVar.c(view, avhnVar4, aragVar8, aragVar9, apzgVar2);
                            TextView textView2 = (TextView) view.findViewById(R.id.video_count);
                            arag aragVar10 = aquvVar.h;
                            if (aragVar10 == null) {
                                aragVar10 = arag.a;
                            }
                            textView2.setText(ajgl.b(aragVar10));
                        } else {
                            zep.b("Cannot create view because of unexpected renderer type.");
                        }
                    }
                    if (view != null) {
                        arrayList.add(view);
                    }
                }
                ahlp ahlpVar = ahrjVar.i;
                if (ahlpVar != null) {
                    if (ahlpVar.k != null) {
                        for (View view2 : arrayList) {
                            ahlpVar.k.addView(view2);
                        }
                    }
                    ahrjVar.a();
                }
            }
        });
    }

    @Override // defpackage.ahlz
    public final boolean f(ahjy ahjyVar) {
        return o(ahjyVar);
    }

    @Override // defpackage.ahlz
    public final boolean g(ahjy ahjyVar) {
        return false;
    }

    @Override // defpackage.ahlz
    public final boolean h(ahjy ahjyVar) {
        return false;
    }

    @Override // defpackage.ahjs, defpackage.ahlb, defpackage.ahmf
    public final void j(ahjy ahjyVar) {
        ahlp ahlpVar;
        int a;
        View childAt;
        if (!o(ahjyVar) || (ahlpVar = this.i) == null) {
            return;
        }
        ahlg a2 = ((ahjs) this).a.a(ahjyVar);
        if (ahlpVar.k == null || !a2.b() || (a = (int) (a2.a() * 4.0f)) >= ahlpVar.k.getChildCount() || (childAt = ahlpVar.k.getChildAt(a)) == null || !childAt.isClickable()) {
            return;
        }
        ahlpVar.j.post(new gys(childAt, 7));
    }

    @Override // defpackage.ahjs, defpackage.ahlb, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        this.j = o(ahjyVar);
        if (!this.k.w() || this.k.x()) {
            a();
            ((ahmr) this.i).n = true != this.j ? 0.5f : 1.0f;
        } else {
            d();
        }
        super.m(ahjyVar);
    }
}
