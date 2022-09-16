package defpackage;

import android.graphics.Rect;
import com.google.android.apps.youtube.app.common.rendering.elements.litho.datastore.MainAppPlayerOverlayDataProvider;
/* compiled from: PG */
/* renamed from: fjj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fjj implements ayqb {
    public final /* synthetic */ MainAppPlayerOverlayDataProvider a;
    private final /* synthetic */ int b;

    public /* synthetic */ fjj(MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider, int i) {
        this.b = i;
        this.a = mainAppPlayerOverlayDataProvider;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider = this.a;
            kfe kfeVar = ((kez) obj).a;
            mainAppPlayerOverlayDataProvider.b = kfeVar.f;
            mainAppPlayerOverlayDataProvider.c = kfeVar.e;
            mainAppPlayerOverlayDataProvider.g();
        } else if (i2 == 1) {
            MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider2 = this.a;
            Rect rect = (Rect) obj;
            if (mainAppPlayerOverlayDataProvider2.a.equals(rect)) {
                return;
            }
            mainAppPlayerOverlayDataProvider2.a.set(rect);
            mainAppPlayerOverlayDataProvider2.g();
        } else {
            MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider3 = this.a;
            ahgh ahghVar = (ahgh) obj;
            mainAppPlayerOverlayDataProvider3.d = ahghVar.b();
            int a = (int) (ahghVar.a() * 100.0f);
            if (a == 25) {
                i = 2;
            } else if (a == 50) {
                i = 3;
            } else if (a == 75) {
                i = 4;
            } else if (a == 100) {
                i = 5;
            } else if (a == 125) {
                i = 6;
            } else if (a == 150) {
                i = 7;
            } else if (a == 175) {
                i = 8;
            } else if (a != 200) {
                mainAppPlayerOverlayDataProvider3.e = 1;
                mainAppPlayerOverlayDataProvider3.g();
            } else {
                i = 9;
            }
            mainAppPlayerOverlayDataProvider3.e = i;
            mainAppPlayerOverlayDataProvider3.g();
        }
    }
}
