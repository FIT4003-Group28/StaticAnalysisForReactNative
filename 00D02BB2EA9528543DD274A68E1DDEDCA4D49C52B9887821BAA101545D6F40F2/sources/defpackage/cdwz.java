package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: cdwz  reason: default package */
/* loaded from: classes4.dex */
final class cdwz extends cdxl {
    public static final /* synthetic */ int s = 0;
    private final MaterialButton t;

    public cdwz(ViewGroup viewGroup) {
        super(viewGroup, R.layout.photo_posts_media_carousel_button);
        this.t = (MaterialButton) this.a.findViewById(R.id.controlName);
    }

    @Override // defpackage.cdxl
    public final void C(cdxd cdxdVar, final cdwo cdwoVar, int i, Object obj) {
        final cdwx a = cdxdVar.a();
        Resources resources = this.t.getContext().getResources();
        this.t.setIcon(resources.getDrawable(a.b(), null));
        this.t.setContentDescription(resources.getString(a.a()));
        this.t.setOnClickListener(new View.OnClickListener(cdwoVar, a) { // from class: cdwy
            private final cdwo a;
            private final cdwx b;

            {
                this.a = cdwoVar;
                this.b = a;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cdwo cdwoVar2 = this.a;
                cdwx cdwxVar = this.b;
                int i2 = cdwz.s;
                cdwoVar2.a(cdwxVar.c());
            }
        });
    }
}
