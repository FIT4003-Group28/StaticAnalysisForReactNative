package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: curj  reason: default package */
/* loaded from: classes5.dex */
public final class curj extends abg<curi> {
    public final List<cuqa> a = new ArrayList();
    public final cuuc e;
    private final cuwi f;
    private final boolean g;

    public curj(cuuc cuucVar, cuwi cuwiVar, boolean z) {
        this.e = cuucVar;
        this.f = cuwiVar;
        this.g = z;
    }

    @Override // defpackage.abg
    public final int c() {
        return this.a.size();
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ curi d(ViewGroup viewGroup, int i) {
        return new curi(new curh(viewGroup.getContext()));
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(curi curiVar, int i) {
        MaterialButton materialButton;
        final curh curhVar = (curh) curiVar.a;
        final cuqa cuqaVar = this.a.get(i);
        final cuuc cuucVar = this.e;
        cuwi cuwiVar = this.f;
        boolean z = this.g;
        curhVar.b.setText(cuqaVar.a());
        ColorStateList colorStateList = null;
        curhVar.b.setIcon(null);
        if (cuqaVar.g()) {
            materialButton = curhVar.b;
        } else {
            materialButton = curhVar.b;
            colorStateList = ColorStateList.valueOf(akm.c(curhVar.getContext(), R.color.button_text_disabled_color));
        }
        materialButton.setIconTint(colorStateList);
        cstn.a(cuqaVar.b(), new mw(curhVar) { // from class: curf
            private final curh a;

            {
                this.a = curhVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                final curh curhVar2 = this.a;
                cugd cugdVar = (cugd) obj;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(cugdVar.a(), 0, cugdVar.a().length);
                if (decodeByteArray != null) {
                    int a = cuwg.a(curhVar2.getContext(), cugdVar.b());
                    int a2 = cuwg.a(curhVar2.getContext(), cugdVar.c());
                    if (a <= 0 || a2 <= 0) {
                        return;
                    }
                    curhVar2.b.setIcon(new BitmapDrawable(curhVar2.getResources(), Bitmap.createScaledBitmap(decodeByteArray, a, a2, true)));
                    cstn.a(cugdVar.d(), new mw(curhVar2) { // from class: curg
                        private final curh a;

                        {
                            this.a = curhVar2;
                        }

                        @Override // defpackage.mw
                        public final void a(Object obj2) {
                            curh curhVar3 = this.a;
                            curhVar3.b.setIconTint(new ColorStateList(curh.a, new int[]{((Integer) obj2).intValue(), akm.c(curhVar3.getContext(), R.color.button_text_disabled_color)}));
                        }
                    });
                }
            }
        });
        curhVar.b.setTextColor(new ColorStateList(curh.a, new int[]{cuqaVar.d(), akm.c(curhVar.getContext(), R.color.button_text_disabled_color)}));
        curhVar.b.setBackgroundTintList(new ColorStateList(curh.a, new int[]{cuqaVar.e(), akm.c(curhVar.getContext(), R.color.button_disabled_color)}));
        curhVar.b.setStrokeColor(new ColorStateList(curh.a, new int[]{cuqaVar.f(), 0}));
        curhVar.b.setEnabled(cuqaVar.g());
        curhVar.b.setOnClickListener(new View.OnClickListener(cuucVar, cuqaVar) { // from class: cure
            private final cuuc a;
            private final cuqa b;

            {
                this.a = cuucVar;
                this.b = cuqaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cuuc cuucVar2 = this.a;
                cuqa cuqaVar2 = this.b;
                int[][] iArr = curh.a;
                cuucVar2.a(cuqaVar2.c());
            }
        });
        curhVar.c = z;
        if (z) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) curhVar.b.getLayoutParams();
            layoutParams.gravity = 8388611;
            curhVar.b.setLayoutParams(layoutParams);
        }
        cuwiVar.a(String.valueOf(cuqaVar.c().e()), cubx.a);
    }
}
