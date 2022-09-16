package defpackage;

import android.hardware.Camera;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: bbwf  reason: default package */
/* loaded from: classes3.dex */
final class bbwf implements Comparator<Camera.Size> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
        Camera.Size size3 = size;
        Camera.Size size4 = size2;
        return decl.c(size3.width * size3.height, size4.width * size4.height);
    }
}
