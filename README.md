# 模组开发者安装信息
-------------------------------------------
此代码遵循Minecraft Forge的安装方法。它将对原始MCP源代码应用一些小的补丁，为你提供构建成功模组所需的一些数据和功能。

请注意，这些补丁是针对“未重命名”的MCP源代码（即SRG名称）构建的 - 这意味着你将无法直接在正常代码中读取它们。

# 设置过程：
==============================

**步骤1**：打开命令行并浏览到你解压zip文件的文件夹。

**步骤2**：你有一个选择。
如果你更喜欢使用Eclipse：
1. 运行以下命令：`./gradlew genEclipseRuns`
2. 打开Eclipse，选择导入 > 现有的Gradle项目 > 选择文件夹
   或者运行 `gradlew eclipse` 来生成项目。

如果你更喜欢使用IntelliJ：
1. 打开IDEA并导入项目。
2. 选择你的`build.gradle`文件并导入。
3. 运行以下命令：`./gradlew genIntellijRuns`
4. 如果需要，刷新IDEA中的Gradle项目。

如果在任何时候你的IDE中缺少库，或者你遇到了问题，你可以运行 `gradlew --refresh-dependencies` 来刷新本地缓存。运行 `gradlew clean` 来重置所有内容（这不会影响你的代码），然后重新开始这个过程。

# 映射名称：
=============================
默认情况下，MDK配置为使用Mojang官方的映射名称用于Minecraft代码库中的方法和字段。这些名称受特定许可证的约束。所有模组开发者都应该了解这个许可证，如果你不同意，可以在你的`build.gradle`中将映射名称更改为其他众包名称。有关最新许可证文本，请参考映射文件本身，或参考以下链接：
https://github.com/MinecraftForge/MCPConfig/blob/master/Mojang.md

# 其他资源： 
=========================
社区文档：https://docs.minecraftforge.net/en/1.20.1/gettingstarted/
LexManos的安装视频：https://youtu.be/8VEdtQLuLO0
Forge论坛：https://forums.minecraftforge.net/
Forge Discord：https://discord.minecraftforge.net/
