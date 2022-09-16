package com.google.android.apps.gmm.review.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Window;
import com.google.android.apps.gmm.review.impl.MaterialProgressSpinner;
import com.google.android.libraries.material.progress.MaterialProgressBar;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialProgressSpinner extends LifecycleDialog {
    private MaterialProgressBar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialProgressSpinner(rb rbVar) {
        super(rbVar, rbVar);
        dzvx.c(rbVar, "activity");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gmm.review.impl.LifecycleDialog
    public final void g() {
        super.g();
        MaterialProgressBar materialProgressBar = this.a;
        dbsk.s(materialProgressBar);
        materialProgressBar.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gmm.review.impl.LifecycleDialog
    public final void h() {
        MaterialProgressBar materialProgressBar = this.a;
        dbsk.s(materialProgressBar);
        Drawable indeterminateDrawable = materialProgressBar.getIndeterminateDrawable();
        if (indeterminateDrawable instanceof csmr) {
            ((csmr) indeterminateDrawable).a(new Runnable(this) { // from class: bqlt
                private final MaterialProgressSpinner a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.i();
                }
            });
            return;
        }
        final MaterialProgressBar materialProgressBar2 = this.a;
        if (materialProgressBar2.c()) {
            Drawable d = materialProgressBar2.d();
            if (d instanceof csmr) {
                ((csmr) d).a(new Runnable(materialProgressBar2) { // from class: csng
                    private final MaterialProgressBar a;

                    {
                        this.a = materialProgressBar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MaterialProgressBar materialProgressBar3 = this.a;
                        if (materialProgressBar3.getVisibility() == 0) {
                            materialProgressBar3.setVisibility(4);
                        }
                    }
                });
                super.h();
            }
        }
        materialProgressBar2.setVisibility(4);
        super.h();
    }

    public final /* synthetic */ void i() {
        super.h();
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        int e = cqrp.d(20.0d).e(context);
        int[] iArr = {ibl.b().b(context)};
        MaterialProgressBar materialProgressBar = new MaterialProgressBar(context);
        materialProgressBar.setIndeterminate(true);
        materialProgressBar.b(context, null, 0, 2132018552);
        materialProgressBar.setColors(iArr);
        materialProgressBar.a();
        this.a = materialProgressBar;
        materialProgressBar.setPadding(e, e, e, e);
        Window window = getWindow();
        dbsk.s(window);
        window.setBackgroundDrawableResource(17170445);
        setCancelable(false);
        setContentView(this.a);
    }
}
