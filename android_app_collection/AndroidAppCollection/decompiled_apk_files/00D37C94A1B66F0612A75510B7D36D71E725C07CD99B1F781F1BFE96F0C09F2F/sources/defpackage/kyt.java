package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kyt  reason: default package */
/* loaded from: classes3.dex */
public final class kyt extends ajsl implements ajrm {
    private final View a;
    private final aafo b;
    private final TextView c;
    private final TextView d;
    private final ajrp e;
    private final ajrp f;
    private argy g;

    public kyt(Context context, aafo aafoVar) {
        aafoVar.getClass();
        this.b = aafoVar;
        View inflate = View.inflate(context, R.layout.title_and_button_list_header, null);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.button);
        this.d = textView2;
        this.e = new ajrp(aafoVar, textView);
        this.f = new ajrp(aafoVar, textView2, this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(defpackage.ajrs r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyt.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((argy) obj).g.I();
    }

    @Override // defpackage.ajrm
    public final boolean h(View view) {
        apoj apojVar;
        apoj apojVar2;
        auoa auoaVar = this.g.e;
        if (auoaVar == null) {
            auoaVar = auoa.a;
        }
        if (auoaVar.b == 65153809) {
            apojVar = (apoj) auoaVar.c;
        } else {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 8192) != 0) {
            aafo aafoVar = this.b;
            auoa auoaVar2 = this.g.e;
            if (auoaVar2 == null) {
                auoaVar2 = auoa.a;
            }
            if (auoaVar2.b == 65153809) {
                apojVar2 = (apoj) auoaVar2.c;
            } else {
                apojVar2 = apoj.a;
            }
            apzg apzgVar = apojVar2.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            return false;
        }
        return false;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.c();
        this.f.c();
    }
}
