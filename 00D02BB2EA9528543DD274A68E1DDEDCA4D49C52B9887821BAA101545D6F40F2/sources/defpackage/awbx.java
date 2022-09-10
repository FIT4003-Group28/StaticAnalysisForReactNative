package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
/* compiled from: PG */
/* renamed from: awbx  reason: default package */
/* loaded from: classes.dex */
public final class awbx implements amfg {
    private static final byte[] a = new byte[0];
    private final amei b = new amei();
    private final akpf c;
    private final avop d;

    public awbx(akpf akpfVar, avop avopVar) {
        this.c = akpfVar;
        this.d = avopVar;
    }

    @Override // defpackage.amfe
    public final byte[] a(String str) {
        byte[] a2 = this.c.a(str);
        return a2 != null ? a2 : a;
    }

    @Override // defpackage.amfg
    public final boolean b(String str, Integer num, alwn alwnVar) {
        if (d(str)) {
            return true;
        }
        if (this.d == null || alwnVar == null || num == null) {
            return false;
        }
        String valueOf = String.valueOf(num);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("paint-parameters-epoch-");
        sb.append(valueOf);
        if (!d(sb.toString())) {
            return false;
        }
        ((ckco) this.d.a.a(ckia.M)).a(alwnVar.A.L);
        return false;
    }

    @Override // defpackage.amfg
    public final Bitmap c(amfh amfhVar, Bitmap[] bitmapArr) {
        int length;
        Bitmap decodeByteArray;
        Bitmap bitmap;
        Bitmap[] bitmapArr2 = new Bitmap[amfhVar.c.length];
        int i = 0;
        while (true) {
            String[] strArr = amfhVar.c;
            if (i < strArr.length) {
                if (!dbsj.d(strArr[i])) {
                    if (bitmapArr == null || (bitmap = bitmapArr[i]) == null) {
                        byte[] a2 = this.c.a(amfhVar.c[i]);
                        if (a2 == null || (length = a2.length) == 0 || (decodeByteArray = BitmapFactory.decodeByteArray(a2, 0, length)) == null) {
                            return null;
                        }
                        bitmapArr2[i] = decodeByteArray;
                    } else {
                        bitmapArr2[i] = bitmap;
                    }
                }
                i++;
            } else {
                return amei.a(bitmapArr2, amfhVar);
            }
        }
    }

    public final boolean d(String str) {
        return ((awbw) this.c).h().b(str);
    }
}
