package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: arey  reason: default package */
/* loaded from: classes2.dex */
public final class arey {
    public static void A(Iterable iterable, ampt amptVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            amptVar.getClass();
            while (it.hasNext()) {
                if (amptVar.a(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        amptVar.getClass();
        O((List) iterable, amptVar);
    }

    public static amul B(Map map) {
        return amul.c(map.entrySet());
    }

    public static void C(Object obj, Object obj2, Map map) {
        araa.t(obj, obj2);
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            collection = E();
            map.put(obj, collection);
        }
        collection.add(obj2);
    }

    public static void D(Object obj, Object[] objArr, Map map) {
        List asList = Arrays.asList(objArr);
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            for (Object obj2 : asList) {
                araa.t(obj, obj2);
                collection.add(obj2);
            }
            return;
        }
        Iterator it = asList.iterator();
        if (!it.hasNext()) {
            return;
        }
        Collection E = E();
        while (it.hasNext()) {
            Object next = it.next();
            araa.t(obj, next);
            E.add(next);
        }
        map.put(obj, E);
    }

    public static final Collection E() {
        return new ArrayList();
    }

    public static int F(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int G(Object obj) {
        return F(obj == null ? 0 : obj.hashCode());
    }

    public static int H(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > highestOneBit) {
            int i2 = highestOneBit + highestOneBit;
            if (i2 <= 0) {
                return 1073741824;
            }
            return i2;
        }
        return highestOneBit;
    }

    public static void I(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static Intent J(Activity activity, Intent intent) {
        String fileExtensionFromUrl;
        Uri data = intent.getData();
        if (data == null) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("No Uri on upload video intent:");
            sb.append(valueOf);
            zep.l(sb.toString());
            return null;
        }
        String type = activity.getContentResolver().getType(data);
        if (TextUtils.isEmpty(type) && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(data.toString())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        if (TextUtils.isEmpty(type)) {
            String valueOf2 = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
            sb2.append("No mime-type on upload video intent:");
            sb2.append(valueOf2);
            zep.l(sb2.toString());
            return null;
        }
        return new Intent("com.google.android.youtube.intent.action.UPLOAD", data);
    }

    public static void K(String str, Bundle bundle) {
        int dataSize;
        if (bundle == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj == null) {
                dataSize = 0;
            } else {
                Parcel obtain = Parcel.obtain();
                obtain.writeValue(obj);
                dataSize = obtain.dataSize();
                obtain.recycle();
            }
            Locale locale = Locale.US;
            Integer valueOf = Integer.valueOf(dataSize);
            String.format(locale, "onSaveInstanceState entry: class: %s, key: %s, size: %d", str, str2, valueOf);
            if (dataSize > 512000) {
                String valueOf2 = String.valueOf(str2);
                afus.c(1, 27, valueOf2.length() != 0 ? "Bundle value size (on N+) too large for key:".concat(valueOf2) : new String("Bundle value size (on N+) too large for key:"), new Exception(String.format(Locale.US, "class:%s,size:%d", str, valueOf)));
            }
        }
    }

    private static Object L(List list) {
        return list.get(list.size() - 1);
    }

    private static Collection M(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return amxp.q(iterable.iterator());
    }

    private static void N(List list, ampt amptVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (amptVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    private static void O(List list, ampt amptVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!amptVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        N(list, amptVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        N(list, amptVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int f(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int g(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int h(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static amzs i(Iterator it, ampt amptVar) {
        it.getClass();
        amptVar.getClass();
        return new amvz(it, amptVar);
    }

    public static Object j(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object k(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static Iterator l(Iterator it, ampg ampgVar) {
        ampgVar.getClass();
        return new amwa(it, ampgVar);
    }

    public static void m(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean n(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static boolean o(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static Iterable p(Iterable iterable, ampt amptVar) {
        iterable.getClass();
        amptVar.getClass();
        return new amvu(iterable, amptVar);
    }

    public static Iterable q(Iterable iterable, ampg ampgVar) {
        ampgVar.getClass();
        return new amvv(iterable, ampgVar);
    }

    public static Object r(Iterable iterable, Object obj) {
        return j(iterable.iterator(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object s(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            if (iterable.isEmpty()) {
                throw new NoSuchElementException();
            }
            return L(iterable);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object t(Iterable iterable) {
        Iterator it = iterable.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean u(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return n(collection, iterable.iterator());
    }

    public static boolean v(Iterable iterable, ampt amptVar) {
        Iterator it = iterable.iterator();
        amptVar.getClass();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!amptVar.a(it.next())) {
                i++;
            } else if (i != -1) {
                return true;
            }
        }
        return false;
    }

    public static Object[] w(Iterable iterable) {
        return M(iterable).toArray();
    }

    public static Object[] x(Iterable iterable, Class cls) {
        return y(iterable, amxp.a(cls, 0));
    }

    public static Object[] y(Iterable iterable, Object[] objArr) {
        return M(iterable).toArray(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object z(Iterable iterable) {
        if (iterable.isEmpty()) {
            return null;
        }
        return L(iterable);
    }
}
