package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: xwp  reason: default package */
/* loaded from: classes4.dex */
public final class xwp extends FrameLayout {
    public final ImageView a;
    public final View b;
    public final View c;
    public final ProgressBar d;
    public final View e;
    public apoj f;
    public apoj g;
    private final arid h;

    public xwp(Context context, int i, arid aridVar) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.post_image_carousel_cell, (ViewGroup) this, true);
        this.h = aridVar;
        ImageView imageView = (ImageView) findViewById(R.id.carousel_image);
        this.a = imageView;
        View findViewById = findViewById(R.id.carousel_image_delete_button);
        this.b = findViewById;
        View findViewById2 = findViewById(R.id.carousel_image_edit_button);
        this.c = findViewById2;
        this.d = (ProgressBar) findViewById(R.id.upload_progress_bar);
        this.e = findViewById(R.id.image_upload_error);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.getLayoutParams().width = i;
        imageView.getLayoutParams().height = i;
        zag.k(imageView, imageView.getBackground());
        aunb aunbVar = aridVar.c;
        if ((aunbVar == null ? aunb.a : aunbVar).qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = aridVar.c;
            apoj apojVar = (apoj) (aunbVar2 == null ? aunb.a : aunbVar2).qm(ButtonRendererOuterClass.buttonRenderer);
            this.f = apojVar;
            aovs aovsVar = apojVar.s;
            aovr aovrVar = (aovsVar == null ? aovs.a : aovsVar).c;
            findViewById.setContentDescription((aovrVar == null ? aovr.a : aovrVar).c);
        }
        aunb aunbVar3 = aridVar.d;
        if ((aunbVar3 == null ? aunb.a : aunbVar3).qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar4 = aridVar.d;
            apoj apojVar2 = (apoj) (aunbVar4 == null ? aunb.a : aunbVar4).qm(ButtonRendererOuterClass.buttonRenderer);
            this.g = apojVar2;
            aovs aovsVar2 = apojVar2.s;
            aovr aovrVar2 = (aovsVar2 == null ? aovs.a : aovsVar2).c;
            String str = (aovrVar2 == null ? aovr.a : aovrVar2).c;
            findViewById2.setContentDescription(str);
            imageView.setContentDescription(str);
        }
    }
}
