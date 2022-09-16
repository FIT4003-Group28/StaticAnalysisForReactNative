package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: iy  reason: default package */
/* loaded from: classes3.dex */
public class iy {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    public static int A(Context context, String str) {
        return z(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static /* synthetic */ String B(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static int C(int i) {
        if (i != 0) {
            if (i == 4) {
                return 4;
            }
            if (i == 8) {
                return 3;
            }
            throw new IllegalArgumentException("Unknown visibility " + i);
        }
        return 2;
    }

    public static int D(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return C(view.getVisibility());
    }

    public static void E(int i, View view) {
        int i2 = i - 1;
        if (i2 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                return;
            }
            if (eo.X(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: Removing view ");
                sb.append(view);
                sb.append(" from container ");
                sb.append(viewGroup);
            }
            viewGroup.removeView(view);
        } else if (i2 == 1) {
            if (eo.X(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SpecialEffectsController: Setting view ");
                sb2.append(view);
                sb2.append(" to VISIBLE");
            }
            view.setVisibility(0);
        } else if (i2 != 2) {
            if (eo.X(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SpecialEffectsController: Setting view ");
                sb3.append(view);
                sb3.append(" to INVISIBLE");
            }
            view.setVisibility(4);
        } else {
            if (eo.X(2)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("SpecialEffectsController: Setting view ");
                sb4.append(view);
                sb4.append(" to GONE");
            }
            view.setVisibility(8);
        }
    }

    public static Intent F(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent == null) {
            String H = H(activity);
            if (H == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, H);
            try {
                if (I(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + H + "' in manifest");
                return null;
            }
        }
        return parentActivityIntent;
    }

    public static Intent G(Context context, ComponentName componentName) {
        String I = I(context, componentName);
        if (I == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), I);
        if (I(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String H(Activity activity) {
        try {
            return I(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String I(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = Build.VERSION.SDK_INT >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str == null) {
            if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
                return null;
            }
            if (string.charAt(0) != '.') {
                return string;
            }
            return context.getPackageName() + string;
        }
        return str;
    }

    private static long M(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] N(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static void O(ArrayList arrayList, char c2, float[] fArr) {
        arrayList.add(new hb(c2, fArr));
    }

    @Deprecated
    public static View c(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int d(bab babVar, ast astVar, int i, boolean z) {
        return babVar.f(astVar, i, z);
    }

    public static void e(bab babVar, pwu pwuVar, int i) {
        babVar.d(pwuVar, i, 0);
    }

    public static int f(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static int g(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static long h(long j) {
        return (j * 48000) / 1000000000;
    }

    public static List i(byte[] bArr) {
        int g = g(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(N(M(g)));
        arrayList.add(N(M(3840L)));
        return arrayList;
    }

    public static hm j(Resources resources, Bitmap bitmap) {
        return new hl(resources, bitmap);
    }

    public static int k(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                c = null;
            }
        }
        return 0;
    }

    public static Drawable l(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof hn)) ? new hp(drawable) : drawable;
    }

    public static void m(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof ho) {
            m(((ho) drawable).c);
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable child = drawableContainerState.getChild(i);
                if (child != null) {
                    m(child);
                }
            }
        }
    }

    public static boolean n(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (!b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                a = null;
            }
        }
        return false;
    }

    public static File o(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long oV(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MediaDescription oW(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    public static ByteBuffer p(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    public static void q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean r(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    q(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            q(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            q(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean s(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean r = r(file, inputStream);
                q(inputStream);
                return r;
            } catch (Throwable th) {
                th = th;
                q(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static Path t(String str) {
        Path path = new Path();
        hb[] v = v(str);
        if (v != null) {
            try {
                hb.a(v, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException("Error in parsing " + str, e);
            }
        }
        return null;
    }

    public static boolean u(hb[] hbVarArr, hb[] hbVarArr2) {
        if (hbVarArr == null || hbVarArr2 == null || hbVarArr.length != hbVarArr2.length) {
            return false;
        }
        for (int i = 0; i < hbVarArr.length; i++) {
            hb hbVar = hbVarArr[i];
            char c2 = hbVar.a;
            hb hbVar2 = hbVarArr2[i];
            if (c2 != hbVar2.a || hbVar.b.length != hbVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4 A[Catch: NumberFormatException -> 0x00c7, LOOP:3: B:29:0x0074->B:48:0x00a4, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00c7, blocks: (B:26:0x005a, B:28:0x006d, B:29:0x0074, B:31:0x007a, B:35:0x0086, B:48:0x00a4, B:39:0x008f, B:43:0x0099, B:50:0x00a9, B:51:0x00b6, B:54:0x00bc, B:56:0x00c0), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[Catch: NumberFormatException -> 0x00c7, TryCatch #0 {NumberFormatException -> 0x00c7, blocks: (B:26:0x005a, B:28:0x006d, B:29:0x0074, B:31:0x007a, B:35:0x0086, B:48:0x00a4, B:39:0x008f, B:43:0x0099, B:50:0x00a9, B:51:0x00b6, B:54:0x00bc, B:56:0x00c0), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc A[Catch: NumberFormatException -> 0x00c7, TryCatch #0 {NumberFormatException -> 0x00c7, blocks: (B:26:0x005a, B:28:0x006d, B:29:0x0074, B:31:0x007a, B:35:0x0086, B:48:0x00a4, B:39:0x008f, B:43:0x0099, B:50:0x00a9, B:51:0x00b6, B:54:0x00bc, B:56:0x00c0), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hb[] v(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy.v(java.lang.String):hb[]");
    }

    public static hb[] w(hb[] hbVarArr) {
        if (hbVarArr == null) {
            return null;
        }
        hb[] hbVarArr2 = new hb[hbVarArr.length];
        for (int i = 0; i < hbVarArr.length; i++) {
            hbVarArr2[i] = new hb(hbVarArr[i]);
        }
        return hbVarArr2;
    }

    public static int y(Context context, String str) {
        return z(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int z(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) != -1) {
            String permissionToOp = Build.VERSION.SDK_INT >= 23 ? AppOpsManager.permissionToOp(str) : null;
            if (permissionToOp == null) {
                return 0;
            }
            if (str2 == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                str2 = packagesForUid[0];
            }
            return (Build.VERSION.SDK_INT < 23 || ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, str2) != 0) ? -2 : 0;
        }
        return -1;
    }

    public void J(dp dpVar) {
    }

    public void K(dp dpVar) {
    }

    public void L(dp dpVar, Bundle bundle) {
    }

    public static float[] x(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int min = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }
}
