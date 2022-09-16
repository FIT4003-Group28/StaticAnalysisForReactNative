package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kys  reason: default package */
/* loaded from: classes3.dex */
public final class kys extends kxf {
    private final View b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final ajrx e;

    public kys(Context context, gem gemVar, aafo aafoVar) {
        super(context, aafoVar);
        this.e = gemVar;
        View inflate = View.inflate(context, R.layout.showing_results_for_item, null);
        this.b = inflate;
        this.c = (YouTubeTextView) inflate.findViewById(R.id.showing_results_for);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.search_instead_for);
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.e).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        aqin aqinVar = (aqin) obj;
        arag aragVar4 = null;
        ajrsVar.a.u(new acte(aqinVar.i), null);
        YouTubeTextView youTubeTextView = this.c;
        if ((aqinVar.b & 1) != 0) {
            aragVar = aqinVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((aqinVar.b & 2) != 0) {
            aragVar2 = aqinVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        apzg apzgVar = aqinVar.e;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        youTubeTextView.setText(d(b, b2, apzgVar, ajrsVar.a.k()));
        YouTubeTextView youTubeTextView2 = this.d;
        if ((aqinVar.b & 8) != 0) {
            aragVar3 = aqinVar.f;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        Spanned b3 = ajgl.b(aragVar3);
        if ((aqinVar.b & 16) != 0 && (aragVar4 = aqinVar.g) == null) {
            aragVar4 = arag.a;
        }
        Spanned b4 = ajgl.b(aragVar4);
        apzg apzgVar2 = aqinVar.h;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        youTubeTextView2.setText(d(b3, b4, apzgVar2, ajrsVar.a.k()));
        this.e.e(ajrsVar);
    }
}
