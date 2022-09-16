package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mmp  reason: default package */
/* loaded from: classes3.dex */
public final class mmp implements ajru {
    public apzg a;
    private final ajmy b;
    private final ImageView c;
    private final ajmu d;

    public mmp(Activity activity, ajmy ajmyVar, aafo aafoVar, ViewGroup viewGroup) {
        this.b = ajmyVar;
        viewGroup.getClass();
        ImageView imageView = (ImageView) LayoutInflater.from(activity).inflate(R.layout.playlist_collaborator, viewGroup, false);
        this.c = imageView;
        imageView.setOnClickListener(new mmn(this, aafoVar));
        ajmt a = ajmu.a();
        a.b(2131232143);
        this.d = a.a();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        audp audpVar = (audp) obj;
        ajmy ajmyVar = this.b;
        ImageView imageView = this.c;
        apzg apzgVar = null;
        if ((audpVar.b & 2) != 0) {
            avhnVar = audpVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.k(imageView, avhnVar, this.d);
        if ((audpVar.b & 8) != 0 && (apzgVar = audpVar.d) == null) {
            apzgVar = apzg.a;
        }
        this.a = apzgVar;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.e(this.c);
    }
}
