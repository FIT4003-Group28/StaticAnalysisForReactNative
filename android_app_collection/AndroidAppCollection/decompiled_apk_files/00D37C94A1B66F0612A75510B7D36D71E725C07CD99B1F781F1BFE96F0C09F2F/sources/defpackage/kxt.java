package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kxt  reason: default package */
/* loaded from: classes3.dex */
public final class kxt extends kxf {
    private final YouTubeTextView b;
    private final ajrx c;

    public kxt(Context context, gem gemVar, aafo aafoVar) {
        super(context, aafoVar);
        this.c = gemVar;
        YouTubeTextView youTubeTextView = (YouTubeTextView) View.inflate(context, R.layout.did_you_mean_item, null);
        this.b = youTubeTextView;
        gemVar.c(youTubeTextView);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.c).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        aqii aqiiVar = (aqii) obj;
        arag aragVar2 = null;
        ajrsVar.a.u(new acte(aqiiVar.f), null);
        YouTubeTextView youTubeTextView = this.b;
        if ((aqiiVar.b & 1) != 0) {
            aragVar = aqiiVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((aqiiVar.b & 2) != 0 && (aragVar2 = aqiiVar.d) == null) {
            aragVar2 = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar2);
        apzg apzgVar = aqiiVar.e;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        youTubeTextView.setText(d(b, b2, apzgVar, ajrsVar.a.k()));
        this.c.e(ajrsVar);
    }
}
