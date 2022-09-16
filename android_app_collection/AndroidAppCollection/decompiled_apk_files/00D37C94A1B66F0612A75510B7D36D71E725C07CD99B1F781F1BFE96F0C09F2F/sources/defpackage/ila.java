package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ila  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ila implements zdt {
    public final /* synthetic */ ilh a;
    private final /* synthetic */ int b;

    public /* synthetic */ ila(ilh ilhVar) {
        this.a = ilhVar;
    }

    public /* synthetic */ ila(ilh ilhVar, int i) {
        this.b = i;
        this.a = ilhVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            View view = (View) obj;
            this.a.a.getSupportActionBar().f();
            return;
        }
        boolean z = true;
        if (i == 1) {
            View view2 = (View) obj;
            this.a.a.getSupportActionBar().r();
        } else if (i != 2) {
            if (i == 3) {
                ilh ilhVar = this.a;
                ilhVar.t(ilhVar.N, 4, (Throwable) obj);
            } else if (i != 4) {
                ilh ilhVar2 = this.a;
                ilhVar2.t(ilhVar2.P, 7, (Throwable) obj);
            } else {
                ilh ilhVar3 = this.a;
                ilhVar3.t(ilhVar3.O, 5, (Throwable) obj);
            }
        } else {
            ilh ilhVar4 = this.a;
            Boolean bool = (Boolean) obj;
            if (!ilhVar4.S) {
                ilhVar4.e();
                return;
            }
            boolean booleanValue = bool.booleanValue();
            ilhVar4.L = booleanValue;
            if (booleanValue) {
                aqxo.z(ilhVar4.A != null, "Video editing fragment is not initialized");
                View findViewById = ilhVar4.a.findViewById(R.id.video_edit_fragment_container);
                try {
                    zxb zxbVar = ilhVar4.A;
                    ScrollView scrollView = ilhVar4.w;
                    scrollView.getClass();
                    View view3 = findViewById == null ? zxbVar.O : findViewById;
                    aqxo.z(view3 != null, "Upload video edit fragment root view does not exist");
                    ViewParent parent = view3.getParent();
                    while (true) {
                        if (parent == null) {
                            z = false;
                            break;
                        } else if (parent == scrollView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                    aqxo.p(z);
                    zxbVar.a = scrollView;
                    zxbVar.a.getViewTreeObserver().addOnScrollChangedListener(zxbVar);
                    findViewById.setVisibility(0);
                } catch (RuntimeException e) {
                    ilhVar4.f215J.b("Cannot setup the video edit fragment", e);
                    ilhVar4.L = false;
                    findViewById.setVisibility(8);
                }
            }
            ilhVar4.s(5);
        }
    }
}
