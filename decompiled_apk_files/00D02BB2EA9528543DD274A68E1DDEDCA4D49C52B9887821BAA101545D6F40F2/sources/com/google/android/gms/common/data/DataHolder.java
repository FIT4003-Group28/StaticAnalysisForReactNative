package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new cntu();
    private static final cnts k = new cntr(new String[0]);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    int[] g;
    public int h;
    boolean i;
    private boolean j;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.i = false;
        this.j = true;
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.i = false;
        this.j = true;
        this.a = 1;
        this.b = strArr;
        this.d = (CursorWindow[]) cnwc.a(cursorWindowArr);
        this.e = i;
        this.f = bundle;
        a();
    }

    public static cnts g(String[] strArr) {
        return new cnts(strArr);
    }

    public static DataHolder h(int i) {
        cnts cntsVar = k;
        return new DataHolder(cntsVar.a, i(cntsVar), i, null);
    }

    public static CursorWindow[] i(cnts cntsVar) {
        if (cntsVar.a.length != 0) {
            ArrayList<HashMap<String, Object>> arrayList = cntsVar.b;
            int size = arrayList.size();
            CursorWindow cursorWindow = new CursorWindow(false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(cursorWindow);
            cursorWindow.setNumColumns(cntsVar.a.length);
            int i = 0;
            boolean z = false;
            while (i < size) {
                try {
                    if (!cursorWindow.allocRow()) {
                        StringBuilder sb = new StringBuilder(72);
                        sb.append("Allocating additional cursor window for large data set (row ");
                        sb.append(i);
                        sb.append(")");
                        sb.toString();
                        cursorWindow = new CursorWindow(false);
                        cursorWindow.setStartPosition(i);
                        cursorWindow.setNumColumns(cntsVar.a.length);
                        arrayList2.add(cursorWindow);
                        if (!cursorWindow.allocRow()) {
                            arrayList2.remove(cursorWindow);
                            return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                        }
                    }
                    HashMap<String, Object> hashMap = arrayList.get(i);
                    int i2 = 0;
                    boolean z2 = true;
                    while (true) {
                        String[] strArr = cntsVar.a;
                        if (i2 < strArr.length) {
                            if (!z2) {
                                break;
                            }
                            String str = strArr[i2];
                            Object obj = hashMap.get(str);
                            if (obj == null) {
                                z2 = cursorWindow.putNull(i, i2);
                            } else if (obj instanceof String) {
                                z2 = cursorWindow.putString((String) obj, i, i2);
                            } else if (obj instanceof Long) {
                                z2 = cursorWindow.putLong(((Long) obj).longValue(), i, i2);
                            } else if (obj instanceof Integer) {
                                z2 = cursorWindow.putLong(((Integer) obj).intValue(), i, i2);
                            } else if (obj instanceof Boolean) {
                                z2 = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i, i2);
                            } else if (obj instanceof byte[]) {
                                z2 = cursorWindow.putBlob((byte[]) obj, i, i2);
                            } else if (obj instanceof Double) {
                                z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i, i2);
                            } else if (obj instanceof Float) {
                                z2 = cursorWindow.putDouble(((Float) obj).floatValue(), i, i2);
                            } else {
                                String valueOf = String.valueOf(obj);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length());
                                sb2.append("Unsupported object for column ");
                                sb2.append(str);
                                sb2.append(": ");
                                sb2.append(valueOf);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i2++;
                        } else if (z2) {
                            z = false;
                        }
                    }
                    if (!z) {
                        StringBuilder sb3 = new StringBuilder(74);
                        sb3.append("Couldn't populate window data for row ");
                        sb3.append(i);
                        sb3.append(" - allocating new window.");
                        sb3.toString();
                        cursorWindow.freeLastRow();
                        cursorWindow = new CursorWindow(false);
                        cursorWindow.setStartPosition(i);
                        cursorWindow.setNumColumns(cntsVar.a.length);
                        arrayList2.add(cursorWindow);
                        i--;
                        z = true;
                        i++;
                    } else {
                        throw new cntt();
                    }
                } catch (RuntimeException e) {
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((CursorWindow) arrayList2.get(i3)).close();
                    }
                    throw e;
                }
            }
            return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
        }
        return new CursorWindow[0];
    }

    public final void a() {
        this.c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.b;
            if (i2 >= strArr.length) {
                break;
            }
            this.c.putInt(strArr[i2], i2);
            i2++;
        }
        this.g = new int[this.d.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.d;
            if (i >= cursorWindowArr.length) {
                this.h = i3;
                return;
            }
            this.g[i] = i3;
            i3 += this.d[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    public final void b(String str, int i) {
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (!f()) {
            if (i >= 0 && i < this.h) {
                return;
            }
            throw new CursorIndexOutOfBoundsException(i, this.h);
        } else {
            throw new IllegalArgumentException("Buffer is closed.");
        }
    }

    public final String c(String str, int i, int i2) {
        b(str, i);
        return this.d[i2].getString(i, this.c.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final byte[] d(String str, int i, int i2) {
        b(str, i);
        return this.d[i2].getBlob(i, this.c.getInt(str));
    }

    public final int e(int i) {
        int length;
        int i2 = 0;
        cnwc.b(i >= 0 && i < this.h);
        while (true) {
            int[] iArr = this.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public final boolean f() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    protected final void finalize() {
        try {
            if (this.j && this.d.length > 0 && !f()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                sb.toString();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.v(parcel, 1, this.b);
        cnwn.x(parcel, 2, this.d, i);
        cnwn.g(parcel, 3, this.e);
        cnwn.m(parcel, 4, this.f);
        cnwn.g(parcel, 1000, this.a);
        cnwn.c(parcel, d);
        if ((i & 1) != 0) {
            close();
        }
    }
}
