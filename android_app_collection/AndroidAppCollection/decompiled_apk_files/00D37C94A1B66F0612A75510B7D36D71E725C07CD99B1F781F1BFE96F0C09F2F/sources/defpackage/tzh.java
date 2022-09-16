package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.feedback.FeedbackOptions;
import java.io.File;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
/* compiled from: PG */
/* renamed from: tzh  reason: default package */
/* loaded from: classes4.dex */
public class tzh {
    public static tqy b(String str, Context context, trv trvVar) {
        aopa aopaVar;
        List h = amqf.c("|").h(str);
        tvg tvgVar = tvg.NEW_FILE_KEY;
        int ordinal = twx.b(context, trvVar).ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (h.size() != 2) {
                    String valueOf = String.valueOf(str);
                    throw new tzg(valueOf.length() != 0 ? "Bad-format serializedFileKey = s".concat(valueOf) : new String("Bad-format serializedFileKey = s"));
                }
                aopaVar = tqy.a.createBuilder();
                String str2 = (String) h.get(0);
                aopaVar.copyOnWrite();
                tqy tqyVar = (tqy) aopaVar.instance;
                str2.getClass();
                tqyVar.b |= 4;
                tqyVar.e = str2;
                int b = tqn.b(Integer.parseInt((String) h.get(1)));
                aopaVar.copyOnWrite();
                tqy tqyVar2 = (tqy) aopaVar.instance;
                int i = b - 1;
                if (b == 0) {
                    throw null;
                }
                tqyVar2.f = i;
                tqyVar2.b |= 8;
            } else if (h.size() != 4) {
                String valueOf2 = String.valueOf(str);
                throw new tzg(valueOf2.length() != 0 ? "Bad-format serializedFileKey = ".concat(valueOf2) : new String("Bad-format serializedFileKey = "));
            } else {
                aopaVar = tqy.a.createBuilder();
                String str3 = (String) h.get(0);
                aopaVar.copyOnWrite();
                tqy tqyVar3 = (tqy) aopaVar.instance;
                str3.getClass();
                tqyVar3.b |= 1;
                tqyVar3.c = str3;
                int parseInt = Integer.parseInt((String) h.get(1));
                aopaVar.copyOnWrite();
                tqy tqyVar4 = (tqy) aopaVar.instance;
                tqyVar4.b |= 2;
                tqyVar4.d = parseInt;
                String str4 = (String) h.get(2);
                aopaVar.copyOnWrite();
                tqy tqyVar5 = (tqy) aopaVar.instance;
                str4.getClass();
                tqyVar5.b |= 4;
                tqyVar5.e = str4;
                int b2 = tqn.b(Integer.parseInt((String) h.get(3)));
                aopaVar.copyOnWrite();
                tqy tqyVar6 = (tqy) aopaVar.instance;
                int i2 = b2 - 1;
                if (b2 == 0) {
                    throw null;
                }
                tqyVar6.f = i2;
                tqyVar6.b |= 8;
            }
        } else if (h.size() != 5) {
            String valueOf3 = String.valueOf(str);
            throw new tzg(valueOf3.length() != 0 ? "Bad-format serializedFileKey = ".concat(valueOf3) : new String("Bad-format serializedFileKey = "));
        } else {
            aopa createBuilder = tqy.a.createBuilder();
            String str5 = (String) h.get(0);
            createBuilder.copyOnWrite();
            tqy tqyVar7 = (tqy) createBuilder.instance;
            str5.getClass();
            tqyVar7.b |= 1;
            tqyVar7.c = str5;
            int parseInt2 = Integer.parseInt((String) h.get(1));
            createBuilder.copyOnWrite();
            tqy tqyVar8 = (tqy) createBuilder.instance;
            tqyVar8.b |= 2;
            tqyVar8.d = parseInt2;
            String str6 = (String) h.get(2);
            createBuilder.copyOnWrite();
            tqy tqyVar9 = (tqy) createBuilder.instance;
            str6.getClass();
            tqyVar9.b |= 4;
            tqyVar9.e = str6;
            int b3 = tqn.b(Integer.parseInt((String) h.get(3)));
            createBuilder.copyOnWrite();
            tqy tqyVar10 = (tqy) createBuilder.instance;
            int i3 = b3 - 1;
            if (b3 == 0) {
                throw null;
            }
            tqyVar10.f = i3;
            tqyVar10.b |= 8;
            if (h.get(4) != null && !((String) h.get(4)).isEmpty()) {
                try {
                    awxs awxsVar = (awxs) uaw.c((String) h.get(4), awxs.a.getParserForType());
                    createBuilder.copyOnWrite();
                    tqy tqyVar11 = (tqy) createBuilder.instance;
                    awxsVar.getClass();
                    tqyVar11.g = awxsVar;
                    tqyVar11.b |= 16;
                } catch (aopx e) {
                    String valueOf4 = String.valueOf(str);
                    throw new tzg(valueOf4.length() != 0 ? "Failed to deserialize key:".concat(valueOf4) : new String("Failed to deserialize key:"), e);
                }
            }
            aopaVar = createBuilder;
        }
        return (tqy) aopaVar.mo39build();
    }

    public static String c(tqy tqyVar, Context context, trv trvVar) {
        tvg tvgVar = tvg.NEW_FILE_KEY;
        int ordinal = twx.b(context, trvVar).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return f(tqyVar);
            }
            if (ordinal == 2) {
                return e(tqyVar);
            }
            return d(tqyVar);
        }
        return d(tqyVar);
    }

    public static String d(tqy tqyVar) {
        StringBuilder sb = new StringBuilder(tqyVar.c);
        sb.append("|");
        sb.append(tqyVar.d);
        sb.append("|");
        sb.append(tqyVar.e);
        sb.append("|");
        int b = tqn.b(tqyVar.f);
        if (b == 0) {
            b = 1;
        }
        sb.append(b - 1);
        return sb.toString();
    }

    public static String e(tqy tqyVar) {
        StringBuilder sb = new StringBuilder(tqyVar.e);
        sb.append("|");
        int b = tqn.b(tqyVar.f);
        if (b == 0) {
            b = 1;
        }
        sb.append(b - 1);
        return sb.toString();
    }

    public static String f(tqy tqyVar) {
        String str;
        StringBuilder sb = new StringBuilder(tqyVar.c);
        sb.append("|");
        sb.append(tqyVar.d);
        sb.append("|");
        sb.append(tqyVar.e);
        sb.append("|");
        int b = tqn.b(tqyVar.f);
        if (b == 0) {
            b = 1;
        }
        sb.append(b - 1);
        sb.append("|");
        if ((tqyVar.b & 16) != 0) {
            awxs awxsVar = tqyVar.g;
            if (awxsVar == null) {
                awxsVar = awxs.a;
            }
            str = uaw.e(awxsVar);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public static ByteBuffer g(Iterable iterable) {
        Iterator it;
        String format;
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (iterable.iterator().hasNext()) {
            j += ((aoqu) it.next()).getSerializedSize() + 12;
            i2++;
        }
        if (i2 != 0) {
            try {
                ByteBuffer allocate = ByteBuffer.allocate((int) j);
                byte[] array = allocate.array();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    aoqu aoquVar = (aoqu) it2.next();
                    int serializedSize = aoquVar.getSerializedSize();
                    try {
                        allocate.putInt(serializedSize);
                        int i3 = i + 4;
                        try {
                            aoquVar.writeTo(aool.am(array, i3, serializedSize));
                        } catch (IOException e) {
                            Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e);
                        }
                        try {
                            allocate.put(array, i3, serializedSize);
                            int i4 = i3 + serializedSize;
                            CRC32 crc32 = new CRC32();
                            crc32.update(array, i4 - serializedSize, serializedSize);
                            allocate.putLong(crc32.getValue());
                            i = i4 + 8;
                        } catch (BufferOverflowException e2) {
                            u(e2);
                            return null;
                        }
                    } catch (BufferOverflowException e3) {
                        u(e3);
                        return null;
                    }
                }
                allocate.rewind();
                return allocate;
            } catch (IllegalArgumentException e4) {
                Object[] objArr = new Object[1];
                if (j > 1073741824) {
                    Locale locale = Locale.US;
                    double d = j;
                    Double.isNaN(d);
                    format = String.format(locale, "%.2fGB", Double.valueOf(d / 1.073741824E9d));
                } else if (j > 1048576) {
                    Locale locale2 = Locale.US;
                    double d2 = j;
                    Double.isNaN(d2);
                    format = String.format(locale2, "%.2fMB", Double.valueOf(d2 / 1048576.0d));
                } else if (j > 1024) {
                    Locale locale3 = Locale.US;
                    double d3 = j;
                    Double.isNaN(d3);
                    format = String.format(locale3, "%.2fKB", Double.valueOf(d3 / 1024.0d));
                } else {
                    format = String.format(Locale.US, "%d Bytes", Long.valueOf(j));
                }
                objArr[0] = format;
                Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", objArr), e4);
                return null;
            }
        }
        return ByteBuffer.allocate(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6 A[LOOP:0: B:3:0x0019->B:29:0x00c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List h(java.nio.ByteBuffer r16, java.lang.Class r17, defpackage.aorb r18) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzh.h(java.nio.ByteBuffer, java.lang.Class, aorb):java.util.List");
    }

    public static tqv i(String str) {
        try {
            return (tqv) uaw.c(str, tqv.a.getParserForType());
        } catch (aopx e) {
            String valueOf = String.valueOf(str);
            throw new tzd(valueOf.length() != 0 ? "Failed to deserialize key:".concat(valueOf) : new String("Failed to deserialize key:"), e);
        }
    }

    public static File j(Context context, ampq ampqVar) {
        String str = "gms_icing_mdd_garbage_file";
        if (ampqVar != null && ampqVar.h()) {
            String str2 = (String) ampqVar.c();
            str = str2.length() != 0 ? str.concat(str2) : new String(str);
        }
        return new File(context.getFilesDir(), str);
    }

    public static String k(tqv tqvVar) {
        return Base64.encodeToString(tqvVar.toByteArray(), 3);
    }

    public static vld l(Context context, ankw ankwVar, tyk tykVar, akem akemVar) {
        vlo d = vlr.d(context, ankwVar);
        d.c = "gms_icing_mdd_groups";
        d.c();
        d.f = v(akemVar);
        d.e(new tze(tykVar, 1));
        return d.a();
    }

    public static vld m(Context context, ankw ankwVar, tyk tykVar, akem akemVar) {
        vlo d = vlr.d(context, ankwVar);
        d.c = "gms_icing_mdd_shared_files";
        d.c();
        d.f = v(akemVar);
        d.e(new tze(tykVar));
        return d.a();
    }

    public static dnw n(Context context, String str, String str2) {
        dnw dnwVar;
        try {
            dnwVar = (dnw) new rch(context, str, str2).a.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            dnwVar = null;
        }
        return dnwVar == null ? rch.d() : dnwVar;
    }

    public static Object o(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static Bundle p(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    @Deprecated
    public static String q() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(abs);
        return sb.toString();
    }

    public static void r(Bundle bundle) {
        if (!((Boolean) rbq.d.a()).booleanValue() || bundle == null) {
            return;
        }
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        if (dataSize <= ((Integer) rbq.c.a()).intValue()) {
            return;
        }
        String valueOf = String.valueOf(rbq.c.a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86);
        sb.append("Max allowed bundle size of ");
        sb.append(valueOf);
        sb.append(" exceeded, you are passing in a bundle of ");
        sb.append(dataSize);
        sb.append(" size.");
        throw new IllegalStateException(sb.toString());
    }

    public static void s(FeedbackOptions feedbackOptions) {
        if (((Boolean) rbq.d.a()).booleanValue()) {
            Parcel obtain = Parcel.obtain();
            rbk.a(feedbackOptions, obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize <= ((Integer) rbq.c.a()).intValue()) {
                return;
            }
            String valueOf = String.valueOf(rbq.c.a());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 104);
            sb.append("Max allowed feedback options size of ");
            sb.append(valueOf);
            sb.append(" exceeded, you are passing in feedback options of ");
            sb.append(dataSize);
            sb.append(" size.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void t(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }

    private static void u(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }

    private static amqo v(final akem akemVar) {
        return new amqo(null) { // from class: tzf
            @Override // defpackage.amqo
            public final Object get() {
                return Boolean.valueOf(akem.this.e() != tqh.PROTOSTORE_ONLY);
            }
        };
    }

    public List a() {
        return null;
    }
}
