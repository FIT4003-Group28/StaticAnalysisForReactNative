package a.g.f;

import a.g.e.f.c;
import a.g.k.b;
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
/* loaded from: classes.dex */
public class i extends j {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.g.f.j
    public b.f a(b.f[] fVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.g.f.j
    public Typeface a(Context context, c.b bVar, Resources resources, int i) {
        try {
            c.C0006c[] a2 = bVar.a();
            int length = a2.length;
            int i2 = 0;
            FontFamily.Builder builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    break;
                }
                c.C0006c c0006c = a2[i3];
                try {
                    Font.Builder weight = new Font.Builder(resources, c0006c.b()).setWeight(c0006c.e());
                    if (!c0006c.f()) {
                        i4 = 0;
                    }
                    Font build = weight.setSlant(i4).setTtcIndex(c0006c.c()).setFontVariationSettings(c0006c.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i3++;
            }
            if (builder == null) {
                return null;
            }
            int i5 = (i & 1) != 0 ? 700 : 400;
            if ((i & 2) != 0) {
                i2 = 1;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // a.g.f.j
    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // a.g.f.j
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = fVarArr.length;
            int i2 = 0;
            FontFamily.Builder builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    int i5 = (i & 1) != 0 ? 700 : 400;
                    if ((i & 2) != 0) {
                        i2 = 1;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
                }
                b.f fVar = fVarArr[i3];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(fVar.c(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(fVar.d());
                        if (!fVar.e()) {
                            i4 = 0;
                        }
                        Font build = weight.setSlant(i4).setTtcIndex(fVar.b()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        if (openFileDescriptor == null) {
                            i3++;
                        }
                    } catch (Throwable th) {
                        if (openFileDescriptor != null) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                    i3++;
                }
                openFileDescriptor.close();
                i3++;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.g.f.j
    public Typeface a(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
