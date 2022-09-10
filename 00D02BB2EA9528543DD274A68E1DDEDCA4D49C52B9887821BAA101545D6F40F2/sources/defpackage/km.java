package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: km  reason: default package */
/* loaded from: classes7.dex */
public final class km extends kq {
    @Override // defpackage.kq
    public final Typeface a(Context context, jo joVar, Resources resources, int i) {
        jp[] jpVarArr;
        try {
            int i2 = 0;
            FontFamily.Builder builder = null;
            for (jp jpVar : joVar.a) {
                try {
                    Font build = new Font.Builder(resources, jpVar.f).setWeight(jpVar.b).setSlant(jpVar.c ? 1 : 0).setTtcIndex(jpVar.e).setFontVariationSettings(jpVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            int i3 = 1 != (i & 1) ? 400 : 700;
            if ((i & 2) != 0) {
                i2 = 1;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i3, i2)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.kq
    public final Typeface b(Context context, alf[] alfVarArr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int i2 = 0;
            FontFamily.Builder builder = null;
            for (alf alfVar : alfVarArr) {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(alfVar.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Font build = new Font.Builder(openFileDescriptor).setWeight(alfVar.c).setSlant(alfVar.d ? 1 : 0).setTtcIndex(alfVar.b).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                            openFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                deki.a(th, th2);
                            }
                            throw th;
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (IOException unused) {
                }
            }
            if (builder != null) {
                int i3 = 1 != (i & 1) ? 400 : 700;
                if ((i & 2) != 0) {
                    i2 = 1;
                }
                return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i3, i2)).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // defpackage.kq
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kq
    public final alf k(alf[] alfVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kq
    public final Typeface l(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
