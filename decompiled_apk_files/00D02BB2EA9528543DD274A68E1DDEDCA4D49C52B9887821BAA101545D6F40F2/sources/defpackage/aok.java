package defpackage;

import android.content.res.AssetManager;
import android.system.Os;
import android.system.OsConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* compiled from: PG */
/* renamed from: aok  reason: default package */
/* loaded from: classes2.dex */
public final class aok {
    private static final aoi[] A;
    private static final aoi[] B;
    private static final aoi C;
    private static final aoi[] D;
    private static final aoi[] E;
    private static final aoi[] F;
    private static final aoi[] G;
    private static final aoi[] H;
    private static final HashMap<Integer, aoi>[] I;
    private static final HashMap<String, aoi>[] J;
    private static final HashSet<String> K;
    private static final HashMap<Integer, Integer> L;
    private static final byte[] M;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final String[] d;
    static final int[] e;
    static final byte[] f;
    static final aoi[][] g;
    static final Charset h;
    static final byte[] i;
    private static final byte[] j;
    private static final byte[] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static SimpleDateFormat v;
    private static SimpleDateFormat w;
    private static final aoi[] x;
    private static final aoi[] y;
    private static final aoi[] z;
    private String N;
    private FileDescriptor O;
    private AssetManager.AssetInputStream P;
    private int Q;
    private final HashMap<String, aoh>[] R;
    private final Set<Integer> S;
    private ByteOrder T;
    private boolean U;
    private int V;
    private int W;
    private int X;
    private int Y;

    static {
        aoi[] aoiVarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        j = new byte[]{102, 116, 121, 112};
        k = new byte[]{109, 105, 102, 49};
        l = new byte[]{104, 101, 105, 99};
        m = new byte[]{79, 76, 89, 77, 80, 0};
        n = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        o = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        p = new byte[]{101, 88, 73, 102};
        q = new byte[]{73, 72, 68, 82};
        r = new byte[]{73, 69, 78, 68};
        s = new byte[]{82, 73, 70, 70};
        t = new byte[]{87, 69, 66, 80};
        u = new byte[]{69, 88, 73, 70};
        Charset.defaultCharset();
        Charset.defaultCharset();
        Charset.defaultCharset();
        Charset.defaultCharset();
        Charset.defaultCharset();
        d = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        e = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        aoi[] aoiVarArr2 = {new aoi("NewSubfileType", 254, 4), new aoi("SubfileType", 255, 4), new aoi("ImageWidth", 256, 3, 4), new aoi("ImageLength", 257, 3, 4), new aoi("BitsPerSample", 258, 3), new aoi("Compression", 259, 3), new aoi("PhotometricInterpretation", 262, 3), new aoi("ImageDescription", 270, 2), new aoi("Make", 271, 2), new aoi("Model", 272, 2), new aoi("StripOffsets", 273, 3, 4), new aoi("Orientation", 274, 3), new aoi("SamplesPerPixel", 277, 3), new aoi("RowsPerStrip", 278, 3, 4), new aoi("StripByteCounts", 279, 3, 4), new aoi("XResolution", 282, 5), new aoi("YResolution", 283, 5), new aoi("PlanarConfiguration", 284, 3), new aoi("ResolutionUnit", 296, 3), new aoi("TransferFunction", 301, 3), new aoi("Software", 305, 2), new aoi("DateTime", 306, 2), new aoi("Artist", 315, 2), new aoi("WhitePoint", 318, 5), new aoi("PrimaryChromaticities", 319, 5), new aoi("SubIFDPointer", 330, 4), new aoi("JPEGInterchangeFormat", 513, 4), new aoi("JPEGInterchangeFormatLength", 514, 4), new aoi("YCbCrCoefficients", 529, 5), new aoi("YCbCrSubSampling", 530, 3), new aoi("YCbCrPositioning", 531, 3), new aoi("ReferenceBlackWhite", 532, 5), new aoi("Copyright", 33432, 2), new aoi("ExifIFDPointer", 34665, 4), new aoi("GPSInfoIFDPointer", 34853, 4), new aoi("SensorTopBorder", 4, 4), new aoi("SensorLeftBorder", 5, 4), new aoi("SensorBottomBorder", 6, 4), new aoi("SensorRightBorder", 7, 4), new aoi("ISO", 23, 3), new aoi("JpgFromRaw", 46, 7), new aoi("Xmp", 700, 1)};
        x = aoiVarArr2;
        aoi[] aoiVarArr3 = {new aoi("ExposureTime", 33434, 5), new aoi("FNumber", 33437, 5), new aoi("ExposureProgram", 34850, 3), new aoi("SpectralSensitivity", 34852, 2), new aoi("PhotographicSensitivity", 34855, 3), new aoi("OECF", 34856, 7), new aoi("SensitivityType", 34864, 3), new aoi("StandardOutputSensitivity", 34865, 4), new aoi("RecommendedExposureIndex", 34866, 4), new aoi("ISOSpeed", 34867, 4), new aoi("ISOSpeedLatitudeyyy", 34868, 4), new aoi("ISOSpeedLatitudezzz", 34869, 4), new aoi("ExifVersion", 36864, 2), new aoi("DateTimeOriginal", 36867, 2), new aoi("DateTimeDigitized", 36868, 2), new aoi("OffsetTime", 36880, 2), new aoi("OffsetTimeOriginal", 36881, 2), new aoi("OffsetTimeDigitized", 36882, 2), new aoi("ComponentsConfiguration", 37121, 7), new aoi("CompressedBitsPerPixel", 37122, 5), new aoi("ShutterSpeedValue", 37377, 10), new aoi("ApertureValue", 37378, 5), new aoi("BrightnessValue", 37379, 10), new aoi("ExposureBiasValue", 37380, 10), new aoi("MaxApertureValue", 37381, 5), new aoi("SubjectDistance", 37382, 5), new aoi("MeteringMode", 37383, 3), new aoi("LightSource", 37384, 3), new aoi("Flash", 37385, 3), new aoi("FocalLength", 37386, 5), new aoi("SubjectArea", 37396, 3), new aoi("MakerNote", 37500, 7), new aoi("UserComment", 37510, 7), new aoi("SubSecTime", 37520, 2), new aoi("SubSecTimeOriginal", 37521, 2), new aoi("SubSecTimeDigitized", 37522, 2), new aoi("FlashpixVersion", 40960, 7), new aoi("ColorSpace", 40961, 3), new aoi("PixelXDimension", 40962, 3, 4), new aoi("PixelYDimension", 40963, 3, 4), new aoi("RelatedSoundFile", 40964, 2), new aoi("InteroperabilityIFDPointer", 40965, 4), new aoi("FlashEnergy", 41483, 5), new aoi("SpatialFrequencyResponse", 41484, 7), new aoi("FocalPlaneXResolution", 41486, 5), new aoi("FocalPlaneYResolution", 41487, 5), new aoi("FocalPlaneResolutionUnit", 41488, 3), new aoi("SubjectLocation", 41492, 3), new aoi("ExposureIndex", 41493, 5), new aoi("SensingMethod", 41495, 3), new aoi("FileSource", 41728, 7), new aoi("SceneType", 41729, 7), new aoi("CFAPattern", 41730, 7), new aoi("CustomRendered", 41985, 3), new aoi("ExposureMode", 41986, 3), new aoi("WhiteBalance", 41987, 3), new aoi("DigitalZoomRatio", 41988, 5), new aoi("FocalLengthIn35mmFilm", 41989, 3), new aoi("SceneCaptureType", 41990, 3), new aoi("GainControl", 41991, 3), new aoi("Contrast", 41992, 3), new aoi("Saturation", 41993, 3), new aoi("Sharpness", 41994, 3), new aoi("DeviceSettingDescription", 41995, 7), new aoi("SubjectDistanceRange", 41996, 3), new aoi("ImageUniqueID", 42016, 2), new aoi("CameraOwnerName", 42032, 2), new aoi("BodySerialNumber", 42033, 2), new aoi("LensSpecification", 42034, 5), new aoi("LensMake", 42035, 2), new aoi("LensModel", 42036, 2), new aoi("Gamma", 42240, 5), new aoi("DNGVersion", 50706, 1), new aoi("DefaultCropSize", 50720, 3, 4)};
        y = aoiVarArr3;
        aoi[] aoiVarArr4 = {new aoi("GPSVersionID", 0, 1), new aoi("GPSLatitudeRef", 1, 2), new aoi("GPSLatitude", 2, 5, 10), new aoi("GPSLongitudeRef", 3, 2), new aoi("GPSLongitude", 4, 5, 10), new aoi("GPSAltitudeRef", 5, 1), new aoi("GPSAltitude", 6, 5), new aoi("GPSTimeStamp", 7, 5), new aoi("GPSSatellites", 8, 2), new aoi("GPSStatus", 9, 2), new aoi("GPSMeasureMode", 10, 2), new aoi("GPSDOP", 11, 5), new aoi("GPSSpeedRef", 12, 2), new aoi("GPSSpeed", 13, 5), new aoi("GPSTrackRef", 14, 2), new aoi("GPSTrack", 15, 5), new aoi("GPSImgDirectionRef", 16, 2), new aoi("GPSImgDirection", 17, 5), new aoi("GPSMapDatum", 18, 2), new aoi("GPSDestLatitudeRef", 19, 2), new aoi("GPSDestLatitude", 20, 5), new aoi("GPSDestLongitudeRef", 21, 2), new aoi("GPSDestLongitude", 22, 5), new aoi("GPSDestBearingRef", 23, 2), new aoi("GPSDestBearing", 24, 5), new aoi("GPSDestDistanceRef", 25, 2), new aoi("GPSDestDistance", 26, 5), new aoi("GPSProcessingMethod", 27, 7), new aoi("GPSAreaInformation", 28, 7), new aoi("GPSDateStamp", 29, 2), new aoi("GPSDifferential", 30, 3), new aoi("GPSHPositioningError", 31, 5)};
        z = aoiVarArr4;
        aoi[] aoiVarArr5 = {new aoi("InteroperabilityIndex", 1, 2)};
        A = aoiVarArr5;
        aoi[] aoiVarArr6 = {new aoi("NewSubfileType", 254, 4), new aoi("SubfileType", 255, 4), new aoi("ThumbnailImageWidth", 256, 3, 4), new aoi("ThumbnailImageLength", 257, 3, 4), new aoi("BitsPerSample", 258, 3), new aoi("Compression", 259, 3), new aoi("PhotometricInterpretation", 262, 3), new aoi("ImageDescription", 270, 2), new aoi("Make", 271, 2), new aoi("Model", 272, 2), new aoi("StripOffsets", 273, 3, 4), new aoi("ThumbnailOrientation", 274, 3), new aoi("SamplesPerPixel", 277, 3), new aoi("RowsPerStrip", 278, 3, 4), new aoi("StripByteCounts", 279, 3, 4), new aoi("XResolution", 282, 5), new aoi("YResolution", 283, 5), new aoi("PlanarConfiguration", 284, 3), new aoi("ResolutionUnit", 296, 3), new aoi("TransferFunction", 301, 3), new aoi("Software", 305, 2), new aoi("DateTime", 306, 2), new aoi("Artist", 315, 2), new aoi("WhitePoint", 318, 5), new aoi("PrimaryChromaticities", 319, 5), new aoi("SubIFDPointer", 330, 4), new aoi("JPEGInterchangeFormat", 513, 4), new aoi("JPEGInterchangeFormatLength", 514, 4), new aoi("YCbCrCoefficients", 529, 5), new aoi("YCbCrSubSampling", 530, 3), new aoi("YCbCrPositioning", 531, 3), new aoi("ReferenceBlackWhite", 532, 5), new aoi("Copyright", 33432, 2), new aoi("ExifIFDPointer", 34665, 4), new aoi("GPSInfoIFDPointer", 34853, 4), new aoi("DNGVersion", 50706, 1), new aoi("DefaultCropSize", 50720, 3, 4)};
        B = aoiVarArr6;
        C = new aoi("StripOffsets", 273, 3);
        aoi[] aoiVarArr7 = {new aoi("ThumbnailImage", 256, 7), new aoi("CameraSettingsIFDPointer", 8224, 4), new aoi("ImageProcessingIFDPointer", 8256, 4)};
        D = aoiVarArr7;
        aoi[] aoiVarArr8 = {new aoi("PreviewImageStart", 257, 4), new aoi("PreviewImageLength", 258, 4)};
        E = aoiVarArr8;
        aoi[] aoiVarArr9 = {new aoi("AspectFrame", 4371, 3)};
        F = aoiVarArr9;
        aoi[] aoiVarArr10 = {new aoi("ColorSpace", 55, 3)};
        G = aoiVarArr10;
        g = new aoi[][]{aoiVarArr2, aoiVarArr3, aoiVarArr4, aoiVarArr5, aoiVarArr6, aoiVarArr2, aoiVarArr7, aoiVarArr8, aoiVarArr9, aoiVarArr10};
        H = new aoi[]{new aoi("SubIFDPointer", 330, 4), new aoi("ExifIFDPointer", 34665, 4), new aoi("GPSInfoIFDPointer", 34853, 4), new aoi("InteroperabilityIFDPointer", 40965, 4), new aoi("CameraSettingsIFDPointer", 8224, 1), new aoi("ImageProcessingIFDPointer", 8256, 1)};
        new aoi("JPEGInterchangeFormat", 513, 4);
        new aoi("JPEGInterchangeFormatLength", 514, 4);
        I = new HashMap[10];
        J = new HashMap[10];
        K = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        L = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        h = forName;
        i = "Exif\u0000\u0000".getBytes(forName);
        M = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        v = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        w = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            aoi[][] aoiVarArr11 = g;
            int length = aoiVarArr11.length;
            if (i2 < 10) {
                I[i2] = new HashMap<>();
                J[i2] = new HashMap<>();
                for (aoi aoiVar : aoiVarArr11[i2]) {
                    I[i2].put(Integer.valueOf(aoiVar.a), aoiVar);
                    J[i2].put(aoiVar.b, aoiVar);
                }
                i2++;
            } else {
                HashMap<Integer, Integer> hashMap = L;
                aoi[] aoiVarArr12 = H;
                hashMap.put(Integer.valueOf(aoiVarArr12[0].a), 5);
                hashMap.put(Integer.valueOf(aoiVarArr12[1].a), 1);
                hashMap.put(Integer.valueOf(aoiVarArr12[2].a), 2);
                hashMap.put(Integer.valueOf(aoiVarArr12[3].a), 3);
                hashMap.put(Integer.valueOf(aoiVarArr12[4].a), 7);
                hashMap.put(Integer.valueOf(aoiVarArr12[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public aok(InputStream inputStream) {
        aoi[][] aoiVarArr = g;
        int length = aoiVarArr.length;
        this.R = new HashMap[10];
        int length2 = aoiVarArr.length;
        this.S = new HashSet(10);
        this.T = ByteOrder.BIG_ENDIAN;
        FileDescriptor fileDescriptor = null;
        this.N = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.P = (AssetManager.AssetInputStream) inputStream;
            this.O = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (f(fileInputStream.getFD())) {
                    this.P = null;
                    fileDescriptor = fileInputStream.getFD();
                    this.O = fileDescriptor;
                }
            }
            this.P = null;
            this.O = fileDescriptor;
        }
        e(inputStream);
    }

    public static double b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim());
            double parseDouble3 = Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble4 = parseDouble + ((parseDouble2 / parseDouble3) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble4;
            }
            return -parseDouble4;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private final aoh d(String str) {
        if (true == "ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i2 = 0;
        while (true) {
            int length = g.length;
            if (i2 < 10) {
                aoh aohVar = this.R[i2].get(str);
                if (aohVar != null) {
                    return aohVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0153 A[Catch: all -> 0x049e, IOException -> 0x04a3, TryCatch #10 {IOException -> 0x04a3, all -> 0x049e, blocks: (B:3:0x0008, B:5:0x000f, B:6:0x001b, B:7:0x0030, B:9:0x003f, B:11:0x0045, B:12:0x0050, B:14:0x0053, B:19:0x0070, B:71:0x0101, B:125:0x019a, B:128:0x01ac, B:129:0x01b1, B:132:0x01b8, B:184:0x02ca, B:238:0x048d, B:186:0x02d0, B:187:0x02d3, B:188:0x02d4, B:190:0x02e5, B:191:0x02f2, B:194:0x030c, B:197:0x0317, B:199:0x0366, B:201:0x0374, B:202:0x0397, B:206:0x03a1, B:208:0x03b2, B:210:0x03da, B:214:0x03eb, B:217:0x040b, B:218:0x041d, B:220:0x042b, B:222:0x0435, B:225:0x0439, B:227:0x0440, B:229:0x0447, B:231:0x044f, B:232:0x0453, B:233:0x046e, B:211:0x03e0, B:213:0x03e6, B:234:0x0483, B:237:0x048a, B:86:0x012e, B:100:0x014e, B:102:0x0153, B:105:0x015a, B:107:0x015f, B:110:0x0167, B:112:0x016b, B:114:0x0170, B:117:0x017c, B:119:0x0182, B:94:0x0142, B:95:0x0145, B:98:0x014a, B:79:0x0112, B:80:0x0115, B:83:0x011a, B:51:0x00cd, B:50:0x00c6, B:57:0x00db, B:58:0x00de, B:121:0x0188, B:123:0x0193), top: B:259:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ac A[Catch: all -> 0x049e, IOException -> 0x04a3, TRY_ENTER, TryCatch #10 {IOException -> 0x04a3, all -> 0x049e, blocks: (B:3:0x0008, B:5:0x000f, B:6:0x001b, B:7:0x0030, B:9:0x003f, B:11:0x0045, B:12:0x0050, B:14:0x0053, B:19:0x0070, B:71:0x0101, B:125:0x019a, B:128:0x01ac, B:129:0x01b1, B:132:0x01b8, B:184:0x02ca, B:238:0x048d, B:186:0x02d0, B:187:0x02d3, B:188:0x02d4, B:190:0x02e5, B:191:0x02f2, B:194:0x030c, B:197:0x0317, B:199:0x0366, B:201:0x0374, B:202:0x0397, B:206:0x03a1, B:208:0x03b2, B:210:0x03da, B:214:0x03eb, B:217:0x040b, B:218:0x041d, B:220:0x042b, B:222:0x0435, B:225:0x0439, B:227:0x0440, B:229:0x0447, B:231:0x044f, B:232:0x0453, B:233:0x046e, B:211:0x03e0, B:213:0x03e6, B:234:0x0483, B:237:0x048a, B:86:0x012e, B:100:0x014e, B:102:0x0153, B:105:0x015a, B:107:0x015f, B:110:0x0167, B:112:0x016b, B:114:0x0170, B:117:0x017c, B:119:0x0182, B:94:0x0142, B:95:0x0145, B:98:0x014a, B:79:0x0112, B:80:0x0115, B:83:0x011a, B:51:0x00cd, B:50:0x00c6, B:57:0x00db, B:58:0x00de, B:121:0x0188, B:123:0x0193), top: B:259:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b1 A[Catch: all -> 0x049e, IOException -> 0x04a3, TRY_LEAVE, TryCatch #10 {IOException -> 0x04a3, all -> 0x049e, blocks: (B:3:0x0008, B:5:0x000f, B:6:0x001b, B:7:0x0030, B:9:0x003f, B:11:0x0045, B:12:0x0050, B:14:0x0053, B:19:0x0070, B:71:0x0101, B:125:0x019a, B:128:0x01ac, B:129:0x01b1, B:132:0x01b8, B:184:0x02ca, B:238:0x048d, B:186:0x02d0, B:187:0x02d3, B:188:0x02d4, B:190:0x02e5, B:191:0x02f2, B:194:0x030c, B:197:0x0317, B:199:0x0366, B:201:0x0374, B:202:0x0397, B:206:0x03a1, B:208:0x03b2, B:210:0x03da, B:214:0x03eb, B:217:0x040b, B:218:0x041d, B:220:0x042b, B:222:0x0435, B:225:0x0439, B:227:0x0440, B:229:0x0447, B:231:0x044f, B:232:0x0453, B:233:0x046e, B:211:0x03e0, B:213:0x03e6, B:234:0x0483, B:237:0x048a, B:86:0x012e, B:100:0x014e, B:102:0x0153, B:105:0x015a, B:107:0x015f, B:110:0x0167, B:112:0x016b, B:114:0x0170, B:117:0x017c, B:119:0x0182, B:94:0x0142, B:95:0x0145, B:98:0x014a, B:79:0x0112, B:80:0x0115, B:83:0x011a, B:51:0x00cd, B:50:0x00c6, B:57:0x00db, B:58:0x00de, B:121:0x0188, B:123:0x0193), top: B:259:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b8 A[Catch: all -> 0x049e, IOException -> 0x04a3, TRY_ENTER, TRY_LEAVE, TryCatch #10 {IOException -> 0x04a3, all -> 0x049e, blocks: (B:3:0x0008, B:5:0x000f, B:6:0x001b, B:7:0x0030, B:9:0x003f, B:11:0x0045, B:12:0x0050, B:14:0x0053, B:19:0x0070, B:71:0x0101, B:125:0x019a, B:128:0x01ac, B:129:0x01b1, B:132:0x01b8, B:184:0x02ca, B:238:0x048d, B:186:0x02d0, B:187:0x02d3, B:188:0x02d4, B:190:0x02e5, B:191:0x02f2, B:194:0x030c, B:197:0x0317, B:199:0x0366, B:201:0x0374, B:202:0x0397, B:206:0x03a1, B:208:0x03b2, B:210:0x03da, B:214:0x03eb, B:217:0x040b, B:218:0x041d, B:220:0x042b, B:222:0x0435, B:225:0x0439, B:227:0x0440, B:229:0x0447, B:231:0x044f, B:232:0x0453, B:233:0x046e, B:211:0x03e0, B:213:0x03e6, B:234:0x0483, B:237:0x048a, B:86:0x012e, B:100:0x014e, B:102:0x0153, B:105:0x015a, B:107:0x015f, B:110:0x0167, B:112:0x016b, B:114:0x0170, B:117:0x017c, B:119:0x0182, B:94:0x0142, B:95:0x0145, B:98:0x014a, B:79:0x0112, B:80:0x0115, B:83:0x011a, B:51:0x00cd, B:50:0x00c6, B:57:0x00db, B:58:0x00de, B:121:0x0188, B:123:0x0193), top: B:259:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d4 A[Catch: all -> 0x049e, IOException -> 0x04a3, TryCatch #10 {IOException -> 0x04a3, all -> 0x049e, blocks: (B:3:0x0008, B:5:0x000f, B:6:0x001b, B:7:0x0030, B:9:0x003f, B:11:0x0045, B:12:0x0050, B:14:0x0053, B:19:0x0070, B:71:0x0101, B:125:0x019a, B:128:0x01ac, B:129:0x01b1, B:132:0x01b8, B:184:0x02ca, B:238:0x048d, B:186:0x02d0, B:187:0x02d3, B:188:0x02d4, B:190:0x02e5, B:191:0x02f2, B:194:0x030c, B:197:0x0317, B:199:0x0366, B:201:0x0374, B:202:0x0397, B:206:0x03a1, B:208:0x03b2, B:210:0x03da, B:214:0x03eb, B:217:0x040b, B:218:0x041d, B:220:0x042b, B:222:0x0435, B:225:0x0439, B:227:0x0440, B:229:0x0447, B:231:0x044f, B:232:0x0453, B:233:0x046e, B:211:0x03e0, B:213:0x03e6, B:234:0x0483, B:237:0x048a, B:86:0x012e, B:100:0x014e, B:102:0x0153, B:105:0x015a, B:107:0x015f, B:110:0x0167, B:112:0x016b, B:114:0x0170, B:117:0x017c, B:119:0x0182, B:94:0x0142, B:95:0x0145, B:98:0x014a, B:79:0x0112, B:80:0x0115, B:83:0x011a, B:51:0x00cd, B:50:0x00c6, B:57:0x00db, B:58:0x00de, B:121:0x0188, B:123:0x0193), top: B:259:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0317 A[Catch: all -> 0x049e, IOException -> 0x04a3, TRY_ENTER, TryCatch #10 {IOException -> 0x04a3, all -> 0x049e, blocks: (B:3:0x0008, B:5:0x000f, B:6:0x001b, B:7:0x0030, B:9:0x003f, B:11:0x0045, B:12:0x0050, B:14:0x0053, B:19:0x0070, B:71:0x0101, B:125:0x019a, B:128:0x01ac, B:129:0x01b1, B:132:0x01b8, B:184:0x02ca, B:238:0x048d, B:186:0x02d0, B:187:0x02d3, B:188:0x02d4, B:190:0x02e5, B:191:0x02f2, B:194:0x030c, B:197:0x0317, B:199:0x0366, B:201:0x0374, B:202:0x0397, B:206:0x03a1, B:208:0x03b2, B:210:0x03da, B:214:0x03eb, B:217:0x040b, B:218:0x041d, B:220:0x042b, B:222:0x0435, B:225:0x0439, B:227:0x0440, B:229:0x0447, B:231:0x044f, B:232:0x0453, B:233:0x046e, B:211:0x03e0, B:213:0x03e6, B:234:0x0483, B:237:0x048a, B:86:0x012e, B:100:0x014e, B:102:0x0153, B:105:0x015a, B:107:0x015f, B:110:0x0167, B:112:0x016b, B:114:0x0170, B:117:0x017c, B:119:0x0182, B:94:0x0142, B:95:0x0145, B:98:0x014a, B:79:0x0112, B:80:0x0115, B:83:0x011a, B:51:0x00cd, B:50:0x00c6, B:57:0x00db, B:58:0x00de, B:121:0x0188, B:123:0x0193), top: B:259:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a1 A[Catch: all -> 0x049e, IOException -> 0x04a3, TRY_ENTER, TryCatch #10 {IOException -> 0x04a3, all -> 0x049e, blocks: (B:3:0x0008, B:5:0x000f, B:6:0x001b, B:7:0x0030, B:9:0x003f, B:11:0x0045, B:12:0x0050, B:14:0x0053, B:19:0x0070, B:71:0x0101, B:125:0x019a, B:128:0x01ac, B:129:0x01b1, B:132:0x01b8, B:184:0x02ca, B:238:0x048d, B:186:0x02d0, B:187:0x02d3, B:188:0x02d4, B:190:0x02e5, B:191:0x02f2, B:194:0x030c, B:197:0x0317, B:199:0x0366, B:201:0x0374, B:202:0x0397, B:206:0x03a1, B:208:0x03b2, B:210:0x03da, B:214:0x03eb, B:217:0x040b, B:218:0x041d, B:220:0x042b, B:222:0x0435, B:225:0x0439, B:227:0x0440, B:229:0x0447, B:231:0x044f, B:232:0x0453, B:233:0x046e, B:211:0x03e0, B:213:0x03e6, B:234:0x0483, B:237:0x048a, B:86:0x012e, B:100:0x014e, B:102:0x0153, B:105:0x015a, B:107:0x015f, B:110:0x0167, B:112:0x016b, B:114:0x0170, B:117:0x017c, B:119:0x0182, B:94:0x0142, B:95:0x0145, B:98:0x014a, B:79:0x0112, B:80:0x0115, B:83:0x011a, B:51:0x00cd, B:50:0x00c6, B:57:0x00db, B:58:0x00de, B:121:0x0188, B:123:0x0193), top: B:259:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0483 A[Catch: all -> 0x049e, IOException -> 0x04a3, TRY_LEAVE, TryCatch #10 {IOException -> 0x04a3, all -> 0x049e, blocks: (B:3:0x0008, B:5:0x000f, B:6:0x001b, B:7:0x0030, B:9:0x003f, B:11:0x0045, B:12:0x0050, B:14:0x0053, B:19:0x0070, B:71:0x0101, B:125:0x019a, B:128:0x01ac, B:129:0x01b1, B:132:0x01b8, B:184:0x02ca, B:238:0x048d, B:186:0x02d0, B:187:0x02d3, B:188:0x02d4, B:190:0x02e5, B:191:0x02f2, B:194:0x030c, B:197:0x0317, B:199:0x0366, B:201:0x0374, B:202:0x0397, B:206:0x03a1, B:208:0x03b2, B:210:0x03da, B:214:0x03eb, B:217:0x040b, B:218:0x041d, B:220:0x042b, B:222:0x0435, B:225:0x0439, B:227:0x0440, B:229:0x0447, B:231:0x044f, B:232:0x0453, B:233:0x046e, B:211:0x03e0, B:213:0x03e6, B:234:0x0483, B:237:0x048a, B:86:0x012e, B:100:0x014e, B:102:0x0153, B:105:0x015a, B:107:0x015f, B:110:0x0167, B:112:0x016b, B:114:0x0170, B:117:0x017c, B:119:0x0182, B:94:0x0142, B:95:0x0145, B:98:0x014a, B:79:0x0112, B:80:0x0115, B:83:0x011a, B:51:0x00cd, B:50:0x00c6, B:57:0x00db, B:58:0x00de, B:121:0x0188, B:123:0x0193), top: B:259:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x048a A[Catch: all -> 0x049e, IOException -> 0x04a3, TRY_ENTER, TryCatch #10 {IOException -> 0x04a3, all -> 0x049e, blocks: (B:3:0x0008, B:5:0x000f, B:6:0x001b, B:7:0x0030, B:9:0x003f, B:11:0x0045, B:12:0x0050, B:14:0x0053, B:19:0x0070, B:71:0x0101, B:125:0x019a, B:128:0x01ac, B:129:0x01b1, B:132:0x01b8, B:184:0x02ca, B:238:0x048d, B:186:0x02d0, B:187:0x02d3, B:188:0x02d4, B:190:0x02e5, B:191:0x02f2, B:194:0x030c, B:197:0x0317, B:199:0x0366, B:201:0x0374, B:202:0x0397, B:206:0x03a1, B:208:0x03b2, B:210:0x03da, B:214:0x03eb, B:217:0x040b, B:218:0x041d, B:220:0x042b, B:222:0x0435, B:225:0x0439, B:227:0x0440, B:229:0x0447, B:231:0x044f, B:232:0x0453, B:233:0x046e, B:211:0x03e0, B:213:0x03e6, B:234:0x0483, B:237:0x048a, B:86:0x012e, B:100:0x014e, B:102:0x0153, B:105:0x015a, B:107:0x015f, B:110:0x0167, B:112:0x016b, B:114:0x0170, B:117:0x017c, B:119:0x0182, B:94:0x0142, B:95:0x0145, B:98:0x014a, B:79:0x0112, B:80:0x0115, B:83:0x011a, B:51:0x00cd, B:50:0x00c6, B:57:0x00db, B:58:0x00de, B:121:0x0188, B:123:0x0193), top: B:259:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(java.io.InputStream r26) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aok.e(java.io.InputStream):void");
    }

    private static boolean f(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(defpackage.aog r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aok.g(aog, int, int):void");
    }

    private final void h(aog aogVar) {
        aoh aohVar;
        m(aogVar, aogVar.available());
        n(aogVar, 0);
        s(aogVar, 0);
        s(aogVar, 5);
        s(aogVar, 4);
        r();
        if (this.Q != 8 || (aohVar = this.R[1].get("MakerNote")) == null) {
            return;
        }
        aog aogVar2 = new aog(aohVar.d);
        aogVar2.a = this.T;
        aogVar2.a(6L);
        n(aogVar2, 9);
        aoh aohVar2 = this.R[9].get("ColorSpace");
        if (aohVar2 == null) {
            return;
        }
        this.R[1].put("ColorSpace", aohVar2);
    }

    private final void i(aog aogVar) {
        aogVar.mark(0);
        aogVar.a = ByteOrder.BIG_ENDIAN;
        byte[] bArr = o;
        int length = bArr.length;
        aogVar.skipBytes(8);
        int length2 = bArr.length;
        int i2 = 8;
        while (true) {
            try {
                int readInt = aogVar.readInt();
                byte[] bArr2 = new byte[4];
                if (aogVar.read(bArr2) == 4) {
                    int i3 = i2 + 8;
                    if (i3 == 16) {
                        if (!Arrays.equals(bArr2, q)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                        i3 = 16;
                    }
                    if (Arrays.equals(bArr2, r)) {
                        return;
                    }
                    if (!Arrays.equals(bArr2, p)) {
                        int i4 = readInt + 4;
                        aogVar.skipBytes(i4);
                        i2 = i3 + i4;
                    } else {
                        byte[] bArr3 = new byte[readInt];
                        if (aogVar.read(bArr3) != readInt) {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + x(bArr2));
                        }
                        int readInt2 = aogVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) != readInt2) {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        this.V = i3;
                        k(bArr3, 0);
                        r();
                        o(new aog(bArr3));
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private final void j(aog aogVar) {
        aogVar.mark(0);
        aogVar.a = ByteOrder.LITTLE_ENDIAN;
        int length = s.length;
        aogVar.skipBytes(4);
        int readInt = aogVar.readInt() + 8;
        int length2 = t.length;
        int skipBytes = aogVar.skipBytes(4) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (aogVar.read(bArr) == 4) {
                    int readInt2 = aogVar.readInt();
                    int i2 = skipBytes + 8;
                    if (Arrays.equals(u, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (aogVar.read(bArr2) != readInt2) {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + x(bArr));
                        }
                        this.V = i2;
                        k(bArr2, 0);
                        o(new aog(bArr2));
                        return;
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i3 = i2 + readInt2;
                    if (i3 == readInt) {
                        return;
                    }
                    if (i3 <= readInt) {
                        int skipBytes2 = aogVar.skipBytes(readInt2);
                        if (skipBytes2 != readInt2) {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                        skipBytes = i2 + skipBytes2;
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private final void k(byte[] bArr, int i2) {
        aog aogVar = new aog(bArr);
        m(aogVar, bArr.length);
        n(aogVar, i2);
    }

    private final void l() {
        String a2 = a("DateTimeOriginal");
        if (a2 != null && a("DateTime") == null) {
            this.R[0].put("DateTime", aoh.c(a2));
        }
        if (a("ImageWidth") == null) {
            this.R[0].put("ImageWidth", aoh.b(0L, this.T));
        }
        if (a("ImageLength") == null) {
            this.R[0].put("ImageLength", aoh.b(0L, this.T));
        }
        if (a("Orientation") == null) {
            this.R[0].put("Orientation", aoh.b(0L, this.T));
        }
        if (a("LightSource") == null) {
            this.R[1].put("LightSource", aoh.b(0L, this.T));
        }
    }

    private final void m(aog aogVar, int i2) {
        ByteOrder y2 = y(aogVar);
        this.T = y2;
        aogVar.a = y2;
        int readUnsignedShort = aogVar.readUnsignedShort();
        int i3 = this.Q;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = aogVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i4 = readInt - 8;
            if (i4 <= 0 || aogVar.skipBytes(i4) == i4) {
                return;
            }
            throw new IOException("Couldn't jump to first Ifd: " + i4);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r10 != 3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (r7 != 9) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r10 != 8) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(defpackage.aog r24, int r25) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aok.n(aog, int):void");
    }

    private final void o(aog aogVar) {
        int length;
        int length2;
        aoh aohVar;
        HashMap<String, aoh> hashMap = this.R[4];
        aoh aohVar2 = hashMap.get("Compression");
        if (aohVar2 != null) {
            int f2 = aohVar2.f(this.T);
            if (f2 != 1) {
                if (f2 == 6) {
                    p(aogVar, hashMap);
                    return;
                } else if (f2 != 7) {
                    return;
                }
            }
            aoh aohVar3 = hashMap.get("BitsPerSample");
            if (aohVar3 == null) {
                return;
            }
            int[] iArr = (int[]) aohVar3.e(this.T);
            int[] iArr2 = a;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.Q != 3 || (aohVar = hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int f3 = aohVar.f(this.T);
                if (f3 != 1) {
                    if (f3 != 6 || !Arrays.equals(iArr, iArr2)) {
                        return;
                    }
                } else if (!Arrays.equals(iArr, b)) {
                    return;
                }
            }
            aoh aohVar4 = hashMap.get("StripOffsets");
            aoh aohVar5 = hashMap.get("StripByteCounts");
            if (aohVar4 == null || aohVar5 == null) {
                return;
            }
            long[] v2 = v(aohVar4.e(this.T));
            long[] v3 = v(aohVar5.e(this.T));
            if (v2 == null || (length = v2.length) == 0 || v3 == null || (length2 = v3.length) == 0 || length != length2) {
                return;
            }
            long j2 = 0;
            for (long j3 : v3) {
                j2 += j3;
            }
            byte[] bArr = new byte[(int) j2];
            this.U = true;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int length3 = v2.length;
                if (i2 >= length3) {
                    if (!this.U) {
                        return;
                    }
                    long j4 = v2[0];
                    return;
                }
                int i5 = (int) v2[i2];
                int i6 = (int) v3[i2];
                if (i2 < length3 - 1 && i5 + i6 != v2[i2 + 1]) {
                    this.U = false;
                }
                int i7 = i5 - i3;
                if (i7 < 0) {
                    return;
                }
                long j5 = i7;
                if (aogVar.skip(j5) != j5) {
                    String str = "Failed to skip " + i7 + " bytes.";
                    return;
                }
                int i8 = i3 + i7;
                byte[] bArr2 = new byte[i6];
                if (aogVar.read(bArr2) != i6) {
                    String str2 = "Failed to read " + i6 + " bytes.";
                    return;
                }
                i3 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i4, i6);
                i4 += i6;
                i2++;
            }
        } else {
            p(aogVar, hashMap);
        }
    }

    private final void p(aog aogVar, HashMap hashMap) {
        aoh aohVar = (aoh) hashMap.get("JPEGInterchangeFormat");
        aoh aohVar2 = (aoh) hashMap.get("JPEGInterchangeFormatLength");
        if (aohVar == null || aohVar2 == null) {
            return;
        }
        int f2 = aohVar.f(this.T);
        int f3 = aohVar2.f(this.T);
        if (this.Q == 7) {
            f2 += this.W;
        }
        int min = Math.min(f3, aogVar.b - f2);
        if (f2 <= 0 || min <= 0 || this.N != null || this.P != null || this.O != null) {
            return;
        }
        aogVar.skip(f2);
        aogVar.read(new byte[min]);
    }

    private final boolean q(HashMap hashMap) {
        aoh aohVar = (aoh) hashMap.get("ImageLength");
        aoh aohVar2 = (aoh) hashMap.get("ImageWidth");
        if (aohVar == null || aohVar2 == null) {
            return false;
        }
        return aohVar.f(this.T) <= 512 && aohVar2.f(this.T) <= 512;
    }

    private final void r() {
        t(0, 5);
        t(0, 4);
        t(5, 4);
        aoh aohVar = this.R[1].get("PixelXDimension");
        aoh aohVar2 = this.R[1].get("PixelYDimension");
        if (aohVar != null && aohVar2 != null) {
            this.R[0].put("ImageWidth", aohVar);
            this.R[0].put("ImageLength", aohVar2);
        }
        if (this.R[4].isEmpty() && q(this.R[5])) {
            HashMap<String, aoh>[] hashMapArr = this.R;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        q(this.R[4]);
    }

    private final void s(aog aogVar, int i2) {
        aoh a2;
        aoh a3;
        aoh aohVar = this.R[i2].get("DefaultCropSize");
        aoh aohVar2 = this.R[i2].get("SensorTopBorder");
        aoh aohVar3 = this.R[i2].get("SensorLeftBorder");
        aoh aohVar4 = this.R[i2].get("SensorBottomBorder");
        aoh aohVar5 = this.R[i2].get("SensorRightBorder");
        if (aohVar != null) {
            if (aohVar.a == 5) {
                aoj[] aojVarArr = (aoj[]) aohVar.e(this.T);
                if (aojVarArr == null || aojVarArr.length != 2) {
                    String str = "Invalid crop size values. cropSize=" + Arrays.toString(aojVarArr);
                    return;
                }
                a2 = aoh.d(aojVarArr[0], this.T);
                a3 = aoh.d(aojVarArr[1], this.T);
            } else {
                int[] iArr = (int[]) aohVar.e(this.T);
                if (iArr == null || iArr.length != 2) {
                    String str2 = "Invalid crop size values. cropSize=" + Arrays.toString(iArr);
                    return;
                }
                a2 = aoh.a(iArr[0], this.T);
                a3 = aoh.a(iArr[1], this.T);
            }
            this.R[i2].put("ImageWidth", a2);
            this.R[i2].put("ImageLength", a3);
        } else if (aohVar2 == null || aohVar3 == null || aohVar4 == null || aohVar5 == null) {
            aoh aohVar6 = this.R[i2].get("ImageLength");
            aoh aohVar7 = this.R[i2].get("ImageWidth");
            if (aohVar6 != null && aohVar7 != null) {
                return;
            }
            aoh aohVar8 = this.R[i2].get("JPEGInterchangeFormat");
            aoh aohVar9 = this.R[i2].get("JPEGInterchangeFormatLength");
            if (aohVar8 == null || aohVar9 == null) {
                return;
            }
            int f2 = aohVar8.f(this.T);
            int f3 = aohVar8.f(this.T);
            aogVar.a(f2);
            byte[] bArr = new byte[f3];
            aogVar.read(bArr);
            g(new aog(bArr), f2, i2);
        } else {
            int f4 = aohVar2.f(this.T);
            int f5 = aohVar4.f(this.T);
            int f6 = aohVar5.f(this.T);
            int f7 = aohVar3.f(this.T);
            if (f5 <= f4 || f6 <= f7) {
                return;
            }
            aoh a4 = aoh.a(f5 - f4, this.T);
            aoh a5 = aoh.a(f6 - f7, this.T);
            this.R[i2].put("ImageLength", a4);
            this.R[i2].put("ImageWidth", a5);
        }
    }

    private final void t(int i2, int i3) {
        if (this.R[i2].isEmpty() || this.R[i3].isEmpty()) {
            return;
        }
        aoh aohVar = this.R[i2].get("ImageLength");
        aoh aohVar2 = this.R[i2].get("ImageWidth");
        aoh aohVar3 = this.R[i3].get("ImageLength");
        aoh aohVar4 = this.R[i3].get("ImageWidth");
        if (aohVar == null || aohVar2 == null || aohVar3 == null || aohVar4 == null) {
            return;
        }
        int f2 = aohVar.f(this.T);
        int f3 = aohVar2.f(this.T);
        int f4 = aohVar3.f(this.T);
        int f5 = aohVar4.f(this.T);
        if (f2 >= f4 || f3 >= f5) {
            return;
        }
        HashMap<String, aoh>[] hashMapArr = this.R;
        HashMap<String, aoh> hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    private static void u(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static long[] v(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private static boolean w(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static String x(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i2])));
        }
        return sb.toString();
    }

    private static final ByteOrder y(aog aogVar) {
        short readShort = aogVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final String a(String str) {
        double d2;
        aoh d3 = d(str);
        if (d3 != null) {
            if (!K.contains(str)) {
                return d3.g(this.T);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = d3.a;
                if (i2 == 5 || i2 == 10) {
                    aoj[] aojVarArr = (aoj[]) d3.e(this.T);
                    if (aojVarArr == null || aojVarArr.length != 3) {
                        String str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(aojVarArr);
                        return null;
                    }
                    aoj aojVar = aojVarArr[0];
                    aoj aojVar2 = aojVarArr[1];
                    aoj aojVar3 = aojVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) aojVar.a) / ((float) aojVar.b))), Integer.valueOf((int) (((float) aojVar2.a) / ((float) aojVar2.b))), Integer.valueOf((int) (((float) aojVar3.a) / ((float) aojVar3.b))));
                }
                String str3 = "GPS Timestamp format is not rational. format=" + d3.a;
                return null;
            }
            try {
                Object e2 = d3.e(this.T);
                if (e2 == null) {
                    throw new NumberFormatException("NULL can't be converted to a double value");
                }
                if (e2 instanceof String) {
                    d2 = Double.parseDouble((String) e2);
                } else if (e2 instanceof long[]) {
                    long[] jArr = (long[]) e2;
                    if (jArr.length == 1) {
                        d2 = jArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (e2 instanceof int[]) {
                    int[] iArr = (int[]) e2;
                    if (iArr.length == 1) {
                        d2 = iArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (e2 instanceof double[]) {
                    double[] dArr = (double[]) e2;
                    if (dArr.length == 1) {
                        d2 = dArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (e2 instanceof aoj[]) {
                    aoj[] aojVarArr2 = (aoj[]) e2;
                    if (aojVarArr2.length == 1) {
                        aoj aojVar4 = aojVarArr2[0];
                        double d4 = aojVar4.a;
                        double d5 = aojVar4.b;
                        Double.isNaN(d4);
                        Double.isNaN(d5);
                        d2 = d4 / d5;
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                return Double.toString(d2);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c(int i2) {
        aoh d2 = d("Orientation");
        if (d2 == null) {
            return i2;
        }
        try {
            return d2.f(this.T);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public aok(String str) {
        FileInputStream fileInputStream;
        aoi[][] aoiVarArr = g;
        int length = aoiVarArr.length;
        this.R = new HashMap[10];
        int length2 = aoiVarArr.length;
        this.S = new HashSet(10);
        this.T = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.P = null;
            this.N = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (f(fileInputStream.getFD())) {
                    this.O = fileInputStream.getFD();
                } else {
                    this.O = null;
                }
                e(fileInputStream);
                u(fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                u(fileInputStream2);
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }
}
