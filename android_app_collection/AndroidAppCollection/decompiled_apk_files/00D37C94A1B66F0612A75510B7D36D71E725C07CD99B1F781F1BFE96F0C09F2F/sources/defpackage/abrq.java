package defpackage;

import android.hardware.Camera;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: abrq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abrq implements Comparator {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ abrq(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (this.b == 0) {
            int i = this.a;
            Camera.Size size = (Camera.Size) obj;
            Camera.Size size2 = (Camera.Size) obj2;
            int abs = Math.abs(i - ((size.width * 1000) / size.height));
            int abs2 = Math.abs(i - ((size2.width * 1000) / size2.height));
            return abs != abs2 ? abs - abs2 : (size2.width * size2.height) - (size.width * size.height);
        }
        int i2 = this.a;
        Camera.Size size3 = (Camera.Size) obj;
        Camera.Size size4 = (Camera.Size) obj2;
        int abs3 = Math.abs(i2 - ((size3.width * 1000) / size3.height));
        int abs4 = Math.abs(i2 - ((size4.width * 1000) / size4.height));
        return abs3 != abs4 ? abs3 - abs4 : (size4.width * size4.height) - (size3.width * size3.height);
    }
}
