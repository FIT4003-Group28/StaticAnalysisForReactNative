package com.google.android.filament;
/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class Platform {
    private static Platform mCurrentPlatform;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    class UnknownPlatform extends Platform {
        private UnknownPlatform() {
        }

        @Override // com.google.android.filament.Platform
        public long getSharedContextNativeHandle(Object obj) {
            return 0L;
        }

        @Override // com.google.android.filament.Platform
        void log(String str) {
            System.out.println(str);
        }

        @Override // com.google.android.filament.Platform
        public boolean validateSharedContext(Object obj) {
            return false;
        }

        @Override // com.google.android.filament.Platform
        public boolean validateStreamSource(Object obj) {
            return false;
        }

        @Override // com.google.android.filament.Platform
        public boolean validateSurface(Object obj) {
            return false;
        }

        @Override // com.google.android.filament.Platform
        public void warn(String str) {
            System.out.println(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Platform get() {
        if (mCurrentPlatform == null) {
            try {
                if (isAndroid()) {
                    mCurrentPlatform = (Platform) Class.forName("com.google.android.filament.AndroidPlatform").newInstance();
                } else {
                    mCurrentPlatform = (Platform) Class.forName("com.google.android.filament.DesktopPlatform").newInstance();
                }
            } catch (Exception unused) {
            }
            if (mCurrentPlatform == null) {
                mCurrentPlatform = new UnknownPlatform();
            }
        }
        return mCurrentPlatform;
    }

    static boolean isAndroid() {
        return "The Android Project".equalsIgnoreCase(System.getProperty("java.vendor"));
    }

    static boolean isLinux() {
        return System.getProperty("os.name").contains("Linux") && !isAndroid();
    }

    static boolean isMacOS() {
        return System.getProperty("os.name").contains("Mac OS X");
    }

    static boolean isWindows() {
        return System.getProperty("os.name").contains("Windows");
    }

    public abstract long getSharedContextNativeHandle(Object obj);

    abstract void log(String str);

    public abstract boolean validateSharedContext(Object obj);

    public abstract boolean validateStreamSource(Object obj);

    public abstract boolean validateSurface(Object obj);

    public abstract void warn(String str);
}
