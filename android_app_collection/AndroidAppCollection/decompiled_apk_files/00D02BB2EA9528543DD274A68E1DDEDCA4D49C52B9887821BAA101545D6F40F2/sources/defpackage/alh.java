package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: PG */
/* renamed from: alh  reason: default package */
/* loaded from: classes2.dex */
public final class alh {
    static final ail<String, Typeface> a = new ail<>(16);
    private static final aln d = new aln();
    static final Object b = new Object();
    static final aim<String, ArrayList<alm<alg>>> c = new aim<>();
    private static final Comparator<byte[]> e = new ald();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alg a(Context context, akz akzVar, int i) {
        Cursor cursor;
        Uri withAppendedId;
        ale aleVar;
        try {
            PackageManager packageManager = context.getPackageManager();
            context.getResources();
            String str = akzVar.a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            } else if (!resolveContentProvider.packageName.equals(akzVar.b)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + akzVar.b);
            } else {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Collections.sort(arrayList, e);
                List<List<byte[]>> list = akzVar.d;
                int i2 = 0;
                loop1: while (true) {
                    if (i2 >= list.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList(list.get(i2));
                    Collections.sort(arrayList2, e);
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                            }
                        }
                        break loop1;
                    }
                    i2++;
                }
                if (resolveContentProvider == null) {
                    aleVar = new ale(1, null);
                } else {
                    String str2 = resolveContentProvider.authority;
                    ArrayList arrayList3 = new ArrayList();
                    Uri build = new Uri.Builder().scheme("content").authority(str2).build();
                    Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
                    try {
                        Cursor query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{akzVar.c}, null, null);
                        if (query != null) {
                            try {
                                if (query.getCount() > 0) {
                                    int columnIndex = query.getColumnIndex("result_code");
                                    arrayList3 = new ArrayList();
                                    int columnIndex2 = query.getColumnIndex("_id");
                                    int columnIndex3 = query.getColumnIndex("file_id");
                                    int columnIndex4 = query.getColumnIndex("font_ttc_index");
                                    int columnIndex5 = query.getColumnIndex("font_weight");
                                    int columnIndex6 = query.getColumnIndex("font_italic");
                                    while (query.moveToNext()) {
                                        int i4 = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                                        int i5 = columnIndex4 != -1 ? query.getInt(columnIndex4) : 0;
                                        if (columnIndex3 == -1) {
                                            withAppendedId = ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                                        } else {
                                            withAppendedId = ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                                        }
                                        arrayList3.add(new alf(withAppendedId, i5, columnIndex5 != -1 ? query.getInt(columnIndex5) : 400, columnIndex6 != -1 && query.getInt(columnIndex6) == 1, i4));
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = query;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                        aleVar = new ale(0, (alf[]) arrayList3.toArray(new alf[0]));
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                }
                if (aleVar.a != 0) {
                    return new alg(null, -2);
                }
                Typeface b2 = kh.a.b(context, aleVar.b, i);
                return new alg(b2, b2 != null ? 0 : -3);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new alg(null, -1);
        }
    }

    public static Typeface b(Context context, akz akzVar, jx jxVar, boolean z, int i, int i2) {
        Object obj;
        String str = akzVar.e + "-" + i2;
        Typeface b2 = a.b(str);
        if (b2 != null) {
            if (jxVar != null) {
                jxVar.a(b2);
            }
            return b2;
        } else if (!z || i != -1) {
            ala alaVar = new ala(context, akzVar, i2, str);
            if (z) {
                try {
                    aln alnVar = d;
                    ReentrantLock reentrantLock = new ReentrantLock();
                    Condition newCondition = reentrantLock.newCondition();
                    AtomicReference atomicReference = new AtomicReference();
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    alnVar.a(new all(atomicReference, alaVar, reentrantLock, atomicBoolean, newCondition));
                    reentrantLock.lock();
                    if (!atomicBoolean.get()) {
                        obj = atomicReference.get();
                    } else {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(i);
                        do {
                            try {
                                nanos = newCondition.awaitNanos(nanos);
                            } catch (InterruptedException unused) {
                            }
                            if (!atomicBoolean.get()) {
                                obj = atomicReference.get();
                            }
                        } while (nanos > 0);
                        throw new InterruptedException("timeout");
                    }
                    reentrantLock.unlock();
                    return ((alg) obj).a;
                } catch (InterruptedException unused2) {
                    return null;
                }
            }
            alb albVar = jxVar == null ? null : new alb(jxVar);
            synchronized (b) {
                aim<String, ArrayList<alm<alg>>> aimVar = c;
                ArrayList<alm<alg>> arrayList = aimVar.get(str);
                if (arrayList != null) {
                    if (albVar != null) {
                        arrayList.add(albVar);
                    }
                    return null;
                }
                if (albVar != null) {
                    ArrayList<alm<alg>> arrayList2 = new ArrayList<>();
                    arrayList2.add(albVar);
                    aimVar.put(str, arrayList2);
                }
                d.a(new alk(alaVar, new Handler(), new alc(str)));
                return null;
            }
        } else {
            alg a2 = a(context, akzVar, i2);
            if (jxVar != null) {
                int i3 = a2.b;
                if (i3 == 0) {
                    jxVar.d(a2.a);
                } else {
                    jxVar.c(i3);
                }
            }
            return a2.a;
        }
    }

    public static Map<Uri, ByteBuffer> c(Context context, alf[] alfVarArr) {
        HashMap hashMap = new HashMap();
        for (alf alfVar : alfVarArr) {
            if (alfVar.e == 0) {
                Uri uri = alfVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, kr.e(context, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
