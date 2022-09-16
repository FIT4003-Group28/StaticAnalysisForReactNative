package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.livecreation.ui.view.CropView;
import com.google.android.youtube.R;
import java.io.FileNotFoundException;
/* compiled from: PG */
/* renamed from: acig  reason: default package */
/* loaded from: classes.dex */
public final class acig extends acjb {
    public acif a;
    public CropView b;
    private boolean c;

    @Override // defpackage.dp
    public final void Y() {
        acif acifVar;
        super.Y();
        if (!this.c || (acifVar = this.a) == null) {
            return;
        }
        acik acikVar = (acik) acifVar;
        acikVar.aE();
        zag.q(acikVar.mJ(), R.string.lc_image_load_error, 1);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = mJ().getLayoutInflater().inflate(R.layout.lc_crop_thumbnail_fragment, viewGroup, false);
        CropView cropView = (CropView) inflate.findViewById(R.id.lc_crop_view);
        this.b = cropView;
        Uri uri = (Uri) this.m.getParcelable("ARG_INPUT_IMAGE");
        cropView.a = uri;
        try {
            cropView.f = akel.E(cropView.getContext().getContentResolver(), uri);
            if (((Integer) cropView.f.first).intValue() >= cropView.d && ((Integer) cropView.f.second).intValue() >= cropView.e) {
                Bitmap F = akel.F(cropView.getContext().getContentResolver(), uri);
                cropView.g = F.getWidth();
                cropView.h = F.getHeight();
                cropView.j.setImageBitmap(F);
                cropView.i = new Matrix();
                cropView.requestLayout();
                z = true;
            }
        } catch (FileNotFoundException unused) {
        }
        this.c = !z;
        return inflate;
    }
}
