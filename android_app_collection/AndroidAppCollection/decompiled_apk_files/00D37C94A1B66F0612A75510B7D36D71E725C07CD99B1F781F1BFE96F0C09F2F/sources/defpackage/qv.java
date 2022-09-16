package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import android.util.SparseBooleanArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qv  reason: default package */
/* loaded from: classes4.dex */
public final class qv implements Runnable {
    final /* synthetic */ qw a;

    public qv(qw qwVar) {
        this.a = qwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i;
        qj qjVar;
        while (true) {
            qy a = this.a.a.a();
            if (a == null) {
                this.a.b.set(false);
                return;
            }
            int i2 = a.b;
            if (i2 == 1) {
                this.a.a.b(1);
                qi qiVar = (qi) this.a.c;
                qiVar.c = a.c;
                qiVar.b.clear();
                Cursor cursor = qiVar.g.c.b;
                int count = cursor == null ? 0 : cursor.getCount();
                qiVar.d = count;
                ((qu) qiVar.g.f).a(qy.a(1, qiVar.c, count));
            } else if (i2 == 2) {
                this.a.a.b(2);
                this.a.a.b(3);
                qz qzVar = this.a.c;
                int i3 = a.c;
                int i4 = a.d;
                int i5 = a.e;
                int i6 = a.f;
                int i7 = a.g;
                if (i3 <= i4) {
                    qi qiVar2 = (qi) qzVar;
                    int a2 = qiVar2.a(i3);
                    int a3 = qiVar2.a(i4);
                    qiVar2.e = qiVar2.a(i5);
                    int a4 = qiVar2.a(i6);
                    qiVar2.f = a4;
                    if (i7 == 1) {
                        qiVar2.d(qiVar2.e, a3, 1, true);
                        qiVar2.d(a3 + qiVar2.g.b, qiVar2.f, 1, false);
                    } else {
                        qiVar2.d(a2, a4, i7, false);
                        qiVar2.d(qiVar2.e, a2 - qiVar2.g.b, i7, true);
                    }
                }
            } else if (i2 == 3) {
                qz qzVar2 = this.a.c;
                int i8 = a.c;
                int i9 = a.d;
                qi qiVar3 = (qi) qzVar2;
                if (!qiVar3.b.get(i8)) {
                    rb rbVar = qiVar3.a;
                    if (rbVar != null) {
                        qiVar3.a = rbVar.d;
                    } else {
                        ql qlVar = qiVar3.g;
                        rbVar = new rb(qlVar.a, qlVar.b);
                    }
                    rbVar.b = i8;
                    int min = Math.min(qiVar3.g.b, qiVar3.d - i8);
                    rbVar.c = min;
                    qj qjVar2 = qiVar3.g.c;
                    Object[] objArr = rbVar.a;
                    int i10 = rbVar.b;
                    xpb[] xpbVarArr = (xpb[]) objArr;
                    Cursor cursor2 = qjVar2.b;
                    if (cursor2 != null) {
                        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                        int columnIndexOrThrow2 = qjVar2.b.getColumnIndexOrThrow("_size");
                        int columnIndexOrThrow3 = qjVar2.b.getColumnIndexOrThrow("width");
                        int columnIndexOrThrow4 = qjVar2.b.getColumnIndexOrThrow("height");
                        int columnIndexOrThrow5 = qjVar2.b.getColumnIndexOrThrow("orientation");
                        int i11 = 0;
                        while (i11 < min) {
                            qjVar2.b.moveToPosition(i10 + i11);
                            int i12 = min;
                            long j = qjVar2.b.getLong(columnIndexOrThrow);
                            Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j);
                            int i13 = i10;
                            int i14 = columnIndexOrThrow;
                            Bitmap thumbnail = MediaStore.Images.Thumbnails.getThumbnail(qjVar2.a, j, 1, null);
                            long j2 = qjVar2.b.getLong(columnIndexOrThrow2);
                            int i15 = qjVar2.b.getInt(columnIndexOrThrow3);
                            int i16 = qjVar2.b.getInt(columnIndexOrThrow4);
                            int i17 = qjVar2.b.getInt(columnIndexOrThrow5);
                            if (i17 == 0 || thumbnail == null) {
                                i = columnIndexOrThrow5;
                                qjVar = qjVar2;
                            } else {
                                i = columnIndexOrThrow5;
                                qjVar = qjVar2;
                                if (Build.VERSION.SDK_INT < 29) {
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate(i17);
                                    thumbnail = Bitmap.createBitmap(thumbnail, 0, 0, thumbnail.getWidth(), thumbnail.getHeight(), matrix, true);
                                }
                            }
                            xpbVarArr[i11] = new xpb(withAppendedId, thumbnail, j2, i15, i16, i17, false);
                            i11++;
                            min = i12;
                            i10 = i13;
                            columnIndexOrThrow = i14;
                            columnIndexOrThrow5 = i;
                            qjVar2 = qjVar;
                        }
                    }
                    ql qlVar2 = qiVar3.g;
                    while (qiVar3.b.size() >= 10) {
                        int keyAt = qiVar3.b.keyAt(0);
                        SparseBooleanArray sparseBooleanArray = qiVar3.b;
                        int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                        int i18 = qiVar3.e - keyAt;
                        int i19 = keyAt2 - qiVar3.f;
                        if (i18 > 0 && (i18 >= i19 || i9 == 2)) {
                            qiVar3.c(keyAt);
                        } else if (i19 <= 0) {
                            break;
                        } else {
                            z = true;
                            if (i18 >= i19 && i9 != 1) {
                                break;
                            }
                            qiVar3.c(keyAt2);
                        }
                    }
                    z = true;
                    qiVar3.b.put(rbVar.b, z);
                    ((qu) qiVar3.g.f).a(qy.b(2, qiVar3.c, rbVar));
                }
            } else if (i2 == 4) {
                Object obj = a.h;
                qi qiVar4 = (qi) this.a.c;
                ql qlVar3 = qiVar4.g;
                rb rbVar2 = (rb) obj;
                Object[] objArr2 = rbVar2.a;
                int i20 = rbVar2.c;
                rbVar2.d = qiVar4.a;
                qiVar4.a = rbVar2;
            } else {
                Log.e("ThreadUtil", "Unsupported message, what=" + a.b);
            }
        }
    }
}
