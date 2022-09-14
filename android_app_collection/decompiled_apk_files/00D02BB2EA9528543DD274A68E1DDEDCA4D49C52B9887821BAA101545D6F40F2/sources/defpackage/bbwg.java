package defpackage;

import android.hardware.Camera;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbwg  reason: default package */
/* loaded from: classes3.dex */
public final class bbwg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<Camera.Size> a(final bbvu bbvuVar, List<Camera.Size> list) {
        return dcbg.b(list).o(new dbsl(bbvuVar) { // from class: bbwc
            private final bbvu a;

            {
                this.a = bbvuVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Camera.Size size = (Camera.Size) obj;
                return this.a.equals(new bbvu(size.width, size.height));
            }
        }).z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Camera.Size b(bbvu bbvuVar, List<Camera.Size> list, final int i) {
        dcdc A = dcbg.b(list).A(new bbwf());
        dcdc<Camera.Size> a = a(bbvuVar, A);
        dcdc z = dcbg.b(a).o(new dbsl(i) { // from class: bbwd
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((Camera.Size) obj).width >= this.a;
            }
        }).z();
        if (!z.isEmpty()) {
            return (Camera.Size) z.get(0);
        }
        if (!a.isEmpty()) {
            return (Camera.Size) dcft.s(a);
        }
        return (Camera.Size) A.get(0);
    }
}
