package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csdz  reason: default package */
/* loaded from: classes5.dex */
public final class csdz extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ csea a;
    private int b;
    private int c;

    public csdz(csea cseaVar) {
        this.a = cseaVar;
    }

    private final int b(String str) {
        Throwable th;
        Cursor cursor;
        if (csea.c.contains(Build.MANUFACTURER)) {
            return this.a.e.getApplicationInfo("com.google.android.googlequicksearchbox", 0).enabled ? 2 : 3;
        }
        try {
            cursor = this.a.d.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() != 0) {
                        if (!cursor.moveToFirst()) {
                            cursor.close();
                            return 16;
                        } else if (cursor.getType(0) != 3) {
                            cursor.close();
                            return 17;
                        } else {
                            try {
                                int parseInt = Integer.parseInt(cursor.getString(0));
                                if (parseInt > 12) {
                                    parseInt = 12;
                                }
                                if (csfk.a(parseInt) == 0) {
                                    cursor.close();
                                    return 14;
                                }
                                int a = csfk.a(parseInt);
                                cursor.close();
                                return a;
                            } catch (NumberFormatException unused) {
                                cursor.close();
                                return 18;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return 6;
        } catch (Exception unused2) {
            return 6;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final void a(int i, int i2) {
        int i3 = i - 2;
        if (i != 0) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Lens availability result:");
            sb.append(i3);
            sb.toString();
            int i4 = i2 - 2;
            if (i2 != 0) {
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("Stickers availability result:");
                sb2.append(i4);
                sb2.toString();
                csea cseaVar = this.a;
                csfl csflVar = cseaVar.g;
                dsqp dsqpVar = (dsqp) csflVar.cu(5);
                dsqpVar.bC(csflVar);
                csfi csfiVar = (csfi) dsqpVar;
                if (csfiVar.c) {
                    csfiVar.bF();
                    csfiVar.c = false;
                }
                csfl csflVar2 = (csfl) csfiVar.b;
                csfl csflVar3 = csfl.f;
                csflVar2.d = i3;
                int i5 = csflVar2.a | 4;
                csflVar2.a = i5;
                csflVar2.e = i4;
                csflVar2.a = i5 | 8;
                cseaVar.g = csfiVar.bK();
                csea cseaVar2 = this.a;
                cseaVar2.h = true;
                for (csdx csdxVar : cseaVar2.f) {
                    csdxVar.a(this.a.g);
                }
                this.a.f.clear();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        this.b = b(csea.a);
        this.c = b(csea.b);
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Void r2) {
        a(this.b, this.c);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        new Handler(this.a.d.getMainLooper()).postDelayed(new csdy(this), 4000L);
    }
}
