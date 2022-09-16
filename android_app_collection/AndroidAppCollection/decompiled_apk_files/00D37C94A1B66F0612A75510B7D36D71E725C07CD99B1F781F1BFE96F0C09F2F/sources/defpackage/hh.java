package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: hh  reason: default package */
/* loaded from: classes3.dex */
public final class hh extends hk {
    @Override // defpackage.hk
    public final Typeface a(Context context, gm gmVar, Resources resources, int i) {
        gn[] gnVarArr;
        try {
            int i2 = 0;
            FontFamily.Builder builder = null;
            for (gn gnVar : gmVar.a) {
                try {
                    Font build = new Font.Builder(resources, gnVar.f).setWeight(gnVar.b).setSlant(gnVar.c ? 1 : 0).setTtcIndex(gnVar.e).setFontVariationSettings(gnVar.d).build();
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

    @Override // defpackage.hk
    public final Typeface b(Context context, CancellationSignal cancellationSignal, ald[] aldVarArr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int i2 = 0;
            FontFamily.Builder builder = null;
            for (ald aldVar : aldVarArr) {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(aldVar.a, "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        try {
                            Font build = new Font.Builder(openFileDescriptor).setWeight(aldVar.c).setSlant(aldVar.d ? 1 : 0).setTtcIndex(aldVar.b).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                            openFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (IOException unused2) {
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
        } catch (Exception unused3) {
            return null;
        }
    }

    @Override // defpackage.hk
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hk
    public final Typeface k(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hk
    public final ald l(ald[] aldVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
